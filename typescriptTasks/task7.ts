let result: string | number;
result = "Hello, TypeScript!";
console.log(`result (string): ${result}`);
result = 42;
console.log(`result (number): ${result}`);
function logType(value: string | number | boolean): void {
  if (typeof value === "string") {
    console.log(`The type of the value is: string`);
  } else if (typeof value === "number") {
    console.log(`The type of the value is: number`);
  } else if (typeof value === "boolean") {
    console.log(`The type of the value is: boolean`);
  } else {
    console.log(`Unknown type`);
  }
}
logType("Test String");
logType(123);
logType(true);
