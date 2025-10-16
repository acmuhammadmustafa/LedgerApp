=======================

Title: Ledger App/Ledger Pro



=======================

Overview:

The Ledger Pro is a financial app that allows you to be able to add information about a deposit or payment that you've done and have the information stored in real time! It also allows you to call upon the information that you inputted in a filtered manner, whether it was when a transaction was made or what type, or if you want to see all transactions, it will do that too. Overall, this app is here to allow you to easily access and manage your personal finances.



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



============================================================================================

Beginning by making an arraylist at the beginning above "main(String[] args) {":


<img width="1658" height="706" alt="image" src="https://github.com/user-attachments/assets/52ce760b-4756-4b5b-af3c-62c53a61781c" />



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

Menu Layouts: 


<img width="1241" height="678" alt="image" src="https://github.com/user-attachments/assets/d0b91683-8a52-4b21-acf6-6982dfb4a280" />


This presents the layout of how the code is presenting the menu's as the Ledger and Report menu are very similar to the screenshot above. Not only does this present how the layout of the menu is pushed but also how based on the casing, different methods are called upon.



============================================================================================

Ledger Methods in Action:


<img width="537" height="566" alt="image" src="https://github.com/user-attachments/assets/d17cbe93-4876-41df-b638-c3af804b7405" />

This presents the layout of how the code is calling upon a stored list (transactions) and either presenting all of it, only the payments, or only the deposits based on the value relating to 0 (whether it's greater than or less than.)



============================================================================================

Final Report Menu: 


<img width="1587" height="865" alt="image" src="https://github.com/user-attachments/assets/011c9912-e0da-4ea8-b27d-e60ec2ccb583" />



<img width="909" height="372" alt="image" src="https://github.com/user-attachments/assets/da3c2d2e-a688-4582-89ff-c9f38b5f7799" />



============================================================================================

Within the application:



<img width="336" height="308" alt="image" src="https://github.com/user-attachments/assets/039ddaaa-22a6-49d9-91f2-bf9162a3d0cd" />




<img width="315" height="210" alt="image" src="https://github.com/user-attachments/assets/be9d5be9-2052-4e68-b26f-a62f3f709a22" />




<img width="310" height="225" alt="image" src="https://github.com/user-attachments/assets/3e13d290-5d34-4793-b9f4-0129819a02b9" />
