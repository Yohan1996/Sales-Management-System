# Sales-Management-System

Modern day most of sales companies use latest technology such as sales systems to increase their sales and get profits. Sales system can gives better understand about stocks such as what are the products need this month  and what are the vehicles can use for transport stocks, where the transport stocks in this moment and manage all sales and print bill after customer purchase a product. Head-Office and branches have their own stocks, when request come from a branch to head-office or other one of branch by the sales system, head-office or branch can search those products stocks using the system, if that product stocks have that branch, the branch can sent products to the request branch. Furthermore using the sale system can manage transporting, tract transporting, manage vehicles and drivers of the company, manage stock request and request confirm messages. Using fully computerized database and new technologies include sale system company can do many tasks easily without delay and company can make better decisions for increase sales. 

<b>Class Diagram</b>

![image](https://user-images.githubusercontent.com/69201980/120893309-3f708280-c630-11eb-9914-92f04c8d3fec.png)

<b>Use Case Diagram</b>

![image](https://user-images.githubusercontent.com/69201980/120893321-4eefcb80-c630-11eb-95a3-06330c8e22b0.png)

<b>Sequence Diagram</b>

![image](https://user-images.githubusercontent.com/69201980/120893332-5e6f1480-c630-11eb-8bf6-03fdd78718ce.png)

<b>Intefaces</b>
  
<b>Home Interface</b>
  
![image](https://user-images.githubusercontent.com/69201980/121897917-776a7a80-cd40-11eb-92ef-04e97f43e301.png)
  
This is the first interface of the JK sales system, using this interface can go to login interface. There are two main logins branch login and head-office login. Top of the interface has name of the system.

<b>Head-Office Admin Login</b>
  
![image](https://user-images.githubusercontent.com/69201980/121898007-91a45880-cd40-11eb-8bb9-fa0f5df65353.png)
  
Using this interface can log into main menu of the head-office. Username and password should be correct to log into head-office main menu, if username and password incorrect error message show “Please provide valid entries for both fields”.

<b>Select the Branch</b>
  
In this interface admin should select the correct branch to log in. Galle admin cannot log into Matara branch because Galle branch admin registered to only Galle branch. 
  
![image](https://user-images.githubusercontent.com/69201980/121898391-f3fd5900-cd40-11eb-8972-d595e9f9bd48.png)

<b>Head-Office Home</b>
  
Head Office admins can access all these interfaces. Using these interfaces head-office admins can manage all important sales works. Head-office admins have more access rather than branch admins.

![image](https://user-images.githubusercontent.com/69201980/121898500-11cabe00-cd41-11eb-88e5-81a9d9e14a31.png)

<b>Branch Home</b>

There are three branch home interfaces which are Galle branch home interface, Matara branch home interface and kandy branch home interface. Branch admins can access these interfaces. Request stocks interface can access only branch admins.

![image](https://user-images.githubusercontent.com/69201980/122651135-6a8cc300-d154-11eb-9907-74b0c6b9a96c.png)

![image](https://user-images.githubusercontent.com/69201980/122651138-6eb8e080-d154-11eb-95b1-d61380874834.png)

![image](https://user-images.githubusercontent.com/69201980/122651142-724c6780-d154-11eb-860c-1a8e2d5bc919.png)

<b>Manage Stock</b>

Using this interface can manage all stock details. This interface can use only head-office admins. Head-office admins can insert, update and delete stocks. In addition to that Head-office admins can print all Stock details.

![image](https://user-images.githubusercontent.com/69201980/122651153-83957400-d154-11eb-8ec4-a5785f4d63e2.png)

![image](https://user-images.githubusercontent.com/69201980/122651155-885a2800-d154-11eb-9a06-800e3ee6b173.png)

<b>Manage Sale</b>

Using this interface can manage sales like update and delete sales details. Find button can used for search customer’s purchase details and their purchase product details. Bottom of the interface table have all sales details.

![image](https://user-images.githubusercontent.com/69201980/122651167-9ad46180-d154-11eb-81cd-a84ebfb9d142.png)

<b>Received Stock Requests</b>

Head-Office and each and every branch has their own interface for find received stock requests. This interface shows every details of the requests like date, quantity, product id, product name and where request come from.

![image](https://user-images.githubusercontent.com/69201980/122979511-4380fc00-d3b5-11eb-83cb-f1749a1743b0.png)

<b>Transfer Products</b>

Using this interface can transfer requested product stock to requested branch or cancel requests. Head-office and every branch have this interface with only their own received requested details.

![image](https://user-images.githubusercontent.com/69201980/122979558-51cf1800-d3b5-11eb-9492-5e5d4601d1ea.png)

<b>Track Stocks</b>

In this interface can track all stocks details after request stocks transferred. Can correctly identify which stage transferred stock in. There are three stages like Accepted, Transporting and Delivered. Head-Office and branches can update status of the transaction using radio buttons, after that click submit status button for update status of the transaction correctly.

![image](https://user-images.githubusercontent.com/69201980/122979589-5dbada00-d3b5-11eb-9491-c4c70a8860fb.png)

<b>Manage Branches</b>

Using this interface can manage all branches. This interface can access only head-office admins, branches admins cannot view this interface. Head-Office admins can insert a new branch or update a branch or delete branch details.

![image](https://user-images.githubusercontent.com/69201980/122979821-a377a280-d3b5-11eb-8c90-6736c8538742.png)

<b>Head-Office Vehicles</b>

In this interface can add new vehicles details, update vehicles details and delete vehicles details. Head-office and branches have their own interface for manage vehicles. Matara branch admins cannot view vehicles details of other branches and head-office, Matara branch admins can only view Matara branch vehicles details.

![image](https://user-images.githubusercontent.com/69201980/122981246-2816f080-d3b7-11eb-9eec-15d595ab06de.png)

<b>Create Head-Office Admin Login Account</b>

Head-office admins can only access to this interface, using this interface can create head-office admin login account. In this interface need to give details of the new head-office admin and give username and password for log in to the system.

![image](https://user-images.githubusercontent.com/69201980/122981293-35cc7600-d3b7-11eb-929d-a82404869c70.png)


Validations

![image](https://user-images.githubusercontent.com/69201980/128694779-f511d516-ef06-4d72-bbe6-291b37c67574.png)

![image](https://user-images.githubusercontent.com/69201980/128694807-2c2a4242-601d-494c-a5ab-dabb8692cd77.png)

![image](https://user-images.githubusercontent.com/69201980/128694826-025c3d4b-3202-47c7-bb1e-ca501e952633.png)

![image](https://user-images.githubusercontent.com/69201980/128694718-99a08a89-6a9a-4bc6-ac14-213d5defc6fb.png)

![image](https://user-images.githubusercontent.com/69201980/128694724-b05e82d2-72fe-4490-a7e3-1f568785456a.png)

![image](https://user-images.githubusercontent.com/69201980/128694733-0ec9bd98-94c1-492e-aab9-e7c03fcc7b5c.png)

![image](https://user-images.githubusercontent.com/69201980/128694753-ba99dd94-c30f-4189-bee7-72a0397690db.png)






