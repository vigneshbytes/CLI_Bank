## Question Details

The banking system question asks you to build a command-line application that stores and manages customer information with the following core data structure: 

- **CustId**: Customer ID - Same as AccNo
- **Name**: Customer name
- **Balance**: Account balance
- **EncryptedPwd**: Encrypted password

## Required Tasks 
The system must implement twelve operations:
1. Admin - Adding new customers
2. Admin - Deleting existing customers
3. Admin - Querying for specific customer details
   - eg. Listing customers with balance less than 1000
   - eg. Last N transactions
***
1. User - Money withdrawal functionality
2. User - Money deposit functionality
3. User - Display account summary (last 5 transactions) showing current balance
4. User - Changing customer password (for later)
5. User, Admin - Modifying customer details (for later)
***
1. Developer - access control, etc. 
2. Developer - error checks - Handle invalid operations with clear error messages
***

### LATER
- **_encryption_** (passwords)
- **_immutable_** logs (**_time_** and user)
- **_local file storage_**
***

### Sample Data Structure

Here's an example of how customer data is organized:

| CustId | AccountNo | Name | Balance | EncryptedPwd |
|--------|-----------|------|---------|--------------|
| 11 | 11011 | Madhu | 10000 | AsthYujn |
| 22 | 22022 | Robin | 20000 | 3Dga4mJ |
| 33 | 33033 | Raven | 30000 | 2$gDhbc |

**note: merge CustID and AccNo**

***

# CLI Bank

A command-line banking application built in Java for interview practice.

## Executive Summary

Zoho's Round 3 (Advanced Coding Round) banking CLI application question requires candidates to build a comprehensive banking system within 3 hours. The system must manage customer details and implement 12 distinct operations including account management, transactions, and queries.


## Time and Evaluation Criteria

- **Duration**: 3 hours
- **Difficulty**: Advanced coding level 
- **Extension**: Candidates who complete all modules early may receive additional features to implement 

## Context

This is part of Zoho's off-campus recruitment process for Software Engineer positions. Round 3 is considered the toughest and most critical round, where exceptional performance significantly increases chances of selection. The question tests practical application development, data structure implementation, encryption handling, and the ability to build modular, scalable code under time pressure. 

***
