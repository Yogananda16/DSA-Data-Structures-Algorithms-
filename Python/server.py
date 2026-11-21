import os
import requests
from mcp.server.fastmcp import FastMCP

# Create the MCP server
mcp = FastMCP("Zendesk Server")

# Configure Zendesk access
ZENDESK_URL = "https://company.zendesk.com/api/v2"
ACCESS_TOKEN = os.environ["ZENDESK_ACCESS_TOKEN"]

# Register a tool
@mcp.tool()
def get_support_ticket(ticket_id: int):
    """Retrieve a customer support ticket by its ID."""

    # Construct the API URL
    url = f"{ZENDESK_URL}/tickets/{ticket_id}.json"

    # Authentication
    headers = {
        "Authorization": f"Bearer {ACCESS_TOKEN}"
    }

    # Call the Zendesk API
    response = requests.get(
        url, headers=headers, timeout=10
    )

    # Check for HTTP errors
    response.raise_for_status()

    # Return selected ticket information
    ticket = response.json()["ticket"]

    return {
        "id": ticket["id"],
        "subject": ticket["subject"],
        "status": ticket["status"]
    }

# Start the MCP server
if __name__ == "__main__":
    mcp.run()