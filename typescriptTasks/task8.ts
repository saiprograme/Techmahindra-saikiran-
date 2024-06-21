function combine(flag: boolean, value: number): boolean | number {
    if (flag) {
      return value;
    } else {
      return value > 0;
    }
  }
  const result1 = combine(true, 42);   
  const result2 = combine(false, -5);  
  const result3 = combine(false, 10);  
  
  console.log(`Result 1: ${result1} (type: ${typeof result1})`); 
  console.log(`Result 2: ${result2} (type: ${typeof result2})`); 
  console.log(`Result 3: ${result3} (type: ${typeof result3})`); 
  