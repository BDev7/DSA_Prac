function printAsteriskSequence() {
    // Prompt the user to enter the number of rows
    const rows = parseInt(prompt("Enter the number of rows:"), 10);
  
    if (isNaN(rows) || rows <= 0) {
      console.log("Please enter a valid positive number.");
      return;
    }
  
    let sequence = "";
  
    // Top border
    for (let i = 0; i < rows; i++) {
      sequence += "* ";
    }
    sequence += "\n";
  
    // Middle pattern
    for (let i = 1; i < rows - 1; i++) {
      sequence += "*";
      for (let j = 1; j < rows - 1; j++) {
        if (j === i) {
          sequence += " *";
        } else {
          sequence += "  ";
        }
      }
      sequence += " *\n";
    }
  
    // Bottom border
    for (let i = 0; i < rows; i++) {
      sequence += "* ";
    }
  
    console.log(sequence);
  }
  
  // Call the function to execute
  printAsteriskSequence();
  