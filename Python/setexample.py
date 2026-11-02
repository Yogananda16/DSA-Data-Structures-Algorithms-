# Processing your customers IDs, and want to know whether you have processed one
processed_ids = set()
customer_id = 101

if customer_id in processed_ids:
    print("Already processed")
else:
    processed_ids.add(customer_id)
    print("Processing customer")
