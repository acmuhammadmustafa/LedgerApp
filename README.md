=======================

Title:

Ledger App/Ledger Pro



=======================

Overview:

The Ledger Pro is a financial app that allows you to be able to add information about a deposit or payment that you've done and have the information stored in real time! It also allows you to call upon the information that you inputted

in a filtered manner, whether it was when a transaction was made or what type, or if you want to see all transactions, it will do that too. Overall, this app is here to allow you to easily access and manage your personal finances.



=======================

How to Run:

1. Open your IDE (IntelliJ or Visual Studio Code, etc).

2. Clone/Download the project files.

3. Run the "Main.java" file.

4. Follow the on-screen menu options.



=======================

Features:

This app allows you to:

1.) Input a deposit transaction. 

2.) Input a payment transaction.

3.) Display all recorded transactions. 

4.) Display only deposit transactions. 

5.) Display only payment transactions. 

6.) Display transactions made from the start of the current month to present day. 

7.) Display transactions made within the previous month. 

8.) Display transactions made from the current year to the present day. 

9.) Display transactions made from the previous year. 

10.) Filter through a transaction based on the vendor (Amazon, Walmart, or an individual, etc.)



=======================


Menu Options:


In the application you will be displayed with a home menu:


<img width="262" height="292" alt="image" src="https://github.com/user-attachments/assets/bcb98590-3268-4e65-a64c-97cdfd03cda9" /> 



Home Menu: 
1.) "D) Add Deposit" prompts you to enter deposit information, such as food, clothes, an allowance, a payment received from your job/work, etc. Then it will prompt you to enter a vendor which would be where you received your money from, whether it was a refund, reward, a payment/check, etc. Finally, it'll prompt you on how much was given when asked to "Enter amount". 


2.) "P) Make Payment (Debit)" prompts you to enter payment information, which would fall into categories such as chicken sandwiches, a new TV, pants and/or shirts, etc. Next you'll be prompted to enter a vendor would fall into the categories of shops, for example, Marshalls, Subway, Chick Fil A, etc. Finally, you'll be prompted to enter how much money was spent. Basically, this records what you spend your money on and where and how much you spend your money.


3.) "L) Ledger" displays a new menu:


<img width="262" height="235" alt="image" src="https://github.com/user-attachments/assets/2dc9b8fa-4ffd-41c7-bd42-a0d6fa7cda59" />



============================================================================================


Ledger Menu:

4.) "A) All" will display ALL transactions. 

5.) "D) Deposits" will display ONLY deposits.

6.) "P) Payments" will display ONLY payments.

7.) "R) Reports" will prompt you with a new menu:


<img width="253" height="236" alt="image" src="https://github.com/user-attachments/assets/08f6bf82-986c-4a49-a5cf-342e9da13a51" />



============================================================================================


Reports Menu:

8.) "1) Month to Date" displays transactions from the start of the current month to present day.

9.) "2) Previous Month" displays transactions made within the previous month.

10.) "3) Year to Date" displays transactions made from the current year to the present day.

11.) "4) Previous Year" display transactions made from the previous year.

12.) "5) Search by Vendor" filters through a transaction based on the vendor (Amazon, Walmart, or an individual, etc.)


============================================================================================

Beginning by making an arraylist at the beginning above "main(String[] args) {":


<img width="1658" height="706" alt="image" src="https://github.com/user-attachments/assets/2460155f-ce04-4af5-bc4e-8174cc8f3de5" />



============================================================================================

First (and failed) attempt at making the command ignore casing:


<img width="1795" height="825" alt="image" src="https://github.com/user-attachments/assets/d1bb7de7-cc09-4da4-91a9-ef2f286f1fb8" /> 



============================================================================================

Issue above overcame; Made another case for the lowercase version:


<img width="1762" height="974" alt="image" src="https://github.com/user-attachments/assets/bf051891-dcde-4e5d-a1d3-7f1ec2874403" /> 



============================================================================================

Made methods for the cases:


<img width="538" height="285" alt="image" src="https://github.com/user-attachments/assets/c6d52427-5d0e-4d86-b72a-880e1b80a0bd" />



============================================================================================

Begun modifying methods to do what was intended.


<img width="958" height="554" alt="image" src="https://github.com/user-attachments/assets/db8ffe09-136c-45e7-9900-94f5e3335429" />



============================================================================================

Unpolished and first attempt at FileWriter and BufferedWriter:


<img width="1012" height="416" alt="image" src="https://github.com/user-attachments/assets/22f1d120-089f-414a-805d-5bc7c837956f" />



============================================================================================

Polished and completed version of FileWriter and BufferedWriter:


<img width="1383" height="481" alt="image" src="https://github.com/user-attachments/assets/3d574c78-e411-4452-92a7-7618013e44ae" /> 



============================================================================================

Final Home Menu: 


<img width="1241" height="678" alt="image" src="https://github.com/user-attachments/assets/d0b91683-8a52-4b21-acf6-6982dfb4a280" />



============================================================================================

Final Ledger Menu:


<img width="1294" height="870" alt="image" src="https://github.com/user-attachments/assets/d50aadca-9961-484a-a350-c4c7138c9963" />



============================================================================================

Final Report Menu: 


<img width="1587" height="865" alt="image" src="https://github.com/user-attachments/assets/011c9912-e0da-4ea8-b27d-e60ec2ccb583" />



<img width="909" height="372" alt="image" src="https://github.com/user-attachments/assets/da3c2d2e-a688-4582-89ff-c9f38b5f7799" />



============================================================================================

Within the application:



<img width="336" height="308" alt="image" src="https://github.com/user-attachments/assets/039ddaaa-22a6-49d9-91f2-bf9162a3d0cd" />




<img width="315" height="210" alt="image" src="https://github.com/user-attachments/assets/be9d5be9-2052-4e68-b26f-a62f3f709a22" />




<img width="310" height="225" alt="image" src="https://github.com/user-attachments/assets/3e13d290-5d34-4793-b9f4-0129819a02b9" />
