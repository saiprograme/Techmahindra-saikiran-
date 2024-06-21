var Color;
(function (Color) {
    Color["Red"] = "Red";
    Color["Green"] = "Green";
    Color["White"] = "White";
    Color["Blue"] = "Blue";
})(Color || (Color = {}));
var selectedColor = Color.Green;
function displaySelectedColor(color) {
    console.log("The selected color is: ".concat(color));
}
displaySelectedColor(selectedColor);
