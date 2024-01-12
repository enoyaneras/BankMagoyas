# BankMagoya
Example project demonstrating the use of Java and Spring-boot with Event Sourcing pattern with a MongoDB database

## Run the System
We can easily run the whole with only a single command:
```bash
docker compose up
```
## Testing Postman


### How to test
1. Create account
   > create the account with your id and name of the responsible account`
 > 
   ![Create Account](screenshots/created%20Account.png)
>
> 2. Deposit Cash
>  Use noted `accountNumber` as `targetAccountNo` and provide amount greater than zero to deposit cash into an account
 
   ![CDeposit cash](/screenshots/deposit.png)

   >3. Withdraw Cash
   >Use noted `accountNumber` and `sortCode` and `amount` grater than zero to withdraw cash from an account

   ![CDeposit cash](/screenshots/withdraw.png)

   
  4. balance and account operation
   > Check the balance and account operation
  
   ![CDeposit cash](/screenshots/Account%20Description.png)





   

