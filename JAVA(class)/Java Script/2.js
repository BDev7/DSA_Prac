function printTable(number) {
    console.log("Using for loop:");
    for (let i = 1; i <= 10; i++) {
        console.log(`${number} * ${i} = ${number * i}`);
    }

    console.log("\nUsing while loop:");
    let j = 1;
    while (j <= 10) {
        console.log(`${number} * ${j} = ${number * j}`);
        j++;
    }

    console.log("\nUsing do while loop:");
    let k = 1;
    do {
        console.log(`${number} * ${k} = ${number * k}`);
        k++;
    } while (k <= 10);
}

// User input
const userInput = 5;
printTable(userInput);
