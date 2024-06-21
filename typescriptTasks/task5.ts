
type Product = {
    id: number;
    name: string;
    price: number;
  };
  
 
  let products: Product[] = [];
  
  // Function to add a product to the array
  function addProduct(product: Product): void {
    products.push(product);
    console.log(`Added product: ${product.name}`);
  }
  
  // Function to remove a product by id
  function removeProductById(productId: number): void {
    products = products.filter(product => product.id !== productId);
    console.log(`Removed product with id: ${productId}`);
  }
  
  // Function to list all products
  function listProducts(): void {
    console.log("Listing all products:");
    products.forEach(product => {
      console.log(`ID: ${product.id}, Name: ${product.name}, Price: $${product.price}`);
    });
  }
  
 
  addProduct({ id: 1, name: "Laptop", price: 999.99 });
  addProduct({ id: 2, name: "Smartphone", price: 699.99 });
  addProduct({ id: 3, name: "Tablet", price: 399.99 });
  
 
  listProducts();
  
  
  removeProductById(2);
  
  
  listProducts();
  