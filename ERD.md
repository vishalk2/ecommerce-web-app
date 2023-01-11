Entities
--------

1. Seller (extends User) {
	Seller Name
	PAN No
	Email
	Mobile
	Address
   }

2. Customer (extends User) {
	Name
	Email
	Mobile
	Address
	List<Order>
   }

3. Admin (extends User) {
	Name
	Email
	Mobile
   }

4. User {
	User Id
	Username
	Password
	Role
   }

5. Address {
	Door No
	Area
	City
	State
	Pincode
   }

6. Product {
	Product Id
	Name
	Weight
	Description
	Thumbnail
	Images
	Price
	Category Id
	Stock
   }

7. Category {
	Category Id
	Category Name
	List<Product Id>
   }

8. Order {
	Order Id
	Customer Id
	List<Product>
	Amount
	Shipping Address
	Order Address
	Order Date
	Status
   }

9. Cart {
	List<Product>
   }
