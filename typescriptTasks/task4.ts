


type Address = {
    street: string;
    city: string;
    postalCode: string;
  };
  
  
  type UserProfile = {
    name: string;
    age: number;
    address: Address;
  };
  
  
  
  const userAddress: Address = {
    street: "123 Main Sttask",
    city: "Anytown",
    postalCode: "12345"
  };
  
  const userProfile: UserProfile = {
    name: "Jane Doe",
    age: 28,
    address: userAddress
  };
  
  
  
  console.log("User Address:", userAddress);
  console.log("User Profile:", userProfile);
  