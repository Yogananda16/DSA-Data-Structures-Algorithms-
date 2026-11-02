processed_ids = set()

customer_id = 101

if customer_id in processed_ids:
    print("Already processed")
else:
    processed_ids.add(customer_id)
    print("Processing customer")
