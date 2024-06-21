function combine(flag, value) {
    if (flag) {
        return value;
    }
    else {
        return value > 0;
    }
}
var result1 = combine(true, 42);
var result2 = combine(false, -5);
var result3 = combine(false, 10);
console.log("Result 1: ".concat(result1, " (type: ").concat(typeof result1, ")"));
console.log("Result 2: ".concat(result2, " (type: ").concat(typeof result2, ")"));
console.log("Result 3: ".concat(result3, " (type: ").concat(typeof result3, ")"));
