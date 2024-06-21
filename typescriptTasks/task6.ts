
enum Color {
    Red = "Red",
    Green = "Green",
    White = "White",
    Blue = "Blue"
  }
  let selectedColor: Color = Color.Green;
  function displaySelectedColor(color: Color): void {
    console.log(`The selected color is: ${color}`);
  }
  displaySelectedColor(selectedColor);
  