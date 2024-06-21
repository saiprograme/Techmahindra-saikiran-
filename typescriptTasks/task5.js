var products = [];
// Function to add a product to the array
function addProduct(product) {
    products.push(product);
    console.log("Added product: ".concat(product.name));
}
// Function to remove a product by id
function removeProductById(productId) {
    products = products.filter(function (product) { return product.id !== productId; });
    console.log("Removed product with id: ".concat(productId));
}
// Function to list all products
function listProducts() {
    console.log("Listing all products:");
    products.forEach(function (product) {
        console.log("ID: ".concat(product.id, ", Name: ").concat(product.name, ", Price: $").concat(product.price));
    });
}
addProduct({ id: 1, name: "Laptop", price: 999.99 });
addProduct({ id: 2, name: "Smartphone", price: 699.99 });
addProduct({ id: 3, name: "Tablet", price: 399.99 });
listProducts();
removeProductById(2);
listProducts();
