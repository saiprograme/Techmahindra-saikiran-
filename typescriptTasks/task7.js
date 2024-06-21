var result;
result = "Hello, TypeScript!";
console.log("result (string): ".concat(result));
result = 42;
console.log("result (number): ".concat(result));
function logType(value) {
    if (typeof value === "string") {
        console.log("The type of the value is: string");
    }
    else if (typeof value === "number") {
        console.log("The type of the value is: number");
    }
    else if (typeof value === "boolean") {
        console.log("The type of the value is: boolean");
    }
    else {
        console.log("Unknown type");
    }
}
logType("Test String");
logType(123);
logType(true);
