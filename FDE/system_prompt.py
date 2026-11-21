import os
from anthropic import Anthropic

# Connect to Claude
client = Anthropic(
    api_key=os.environ["ANTHROPIC_API_KEY"]
)

# Define the system instructions
system_prompt = """
You are a retirement support assistant.

Explain financial information clearly.
Never invent transaction details.
"""

# Send the user request to Claude
response = client.messages.create(
    model="YOUR_SUPPORTED_CLAUDE_MODEL",
    max_tokens=300,
    system=system_prompt,
    messages=[
        {
            "role": "user",
            "content": "What is a retirement contribution?"
        }
    ]
)

print(response.content[0].text)