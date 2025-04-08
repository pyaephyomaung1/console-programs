import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

function calculate(operator : string, firstNumber : number, secondNumber: number){
    switch (operator) {
        case '+':
            console.log(`The result is: ${firstNumber + secondNumber}`);
            break;
        case '-':
            console.log(`The result is: ${firstNumber - secondNumber}`);
            break;
        case '*':
            console.log(`The result is: ${firstNumber * secondNumber}`);
            break;
        case '/':
            if (secondNumber === 0) {
                console.log('Error: Division by zero is not allowed.');
            }
            else {
                console.log(`The result is: ${firstNumber / secondNumber}`);
            }
            break;
        default:
            console.log('Error: Invalid operator. Please use +, -, *, or /.');
    }
}

function askQuestion(question: string): Promise<string> {
    return new Promise(resolve => rl.question(question, resolve));
}

async function startCalculator(){
    console.log('Welcome to the TypeScript Calculator!');

    let again = 'y';
    while( again.toLowerCase() === 'y' ){
        const firstOutput = await askQuestion('Enter the first number: ');
        const firstNumber = parseFloat(firstOutput);
        if (isNaN(firstNumber)) {
            console.log('Error: Please enter a valid number.');
            continue;
        }
        const secondNumber = await askQuestion('Enter the second number: ');
        const secondNumberParsed = parseFloat(secondNumber);
        if (isNaN(secondNumberParsed)) {
            console.log('Error: Please enter a valid number.');
            continue;
        }
        const operator = await askQuestion('Enter the operator (+, -, *, /): ');
        calculate(operator, firstNumber, secondNumberParsed);
        again = await askQuestion('Do you want to perform another calculation? (y/n): ');
        console.log('--------------------------------');
    }
    console.log('Thank you for using the TypeScript Calculator!');
    rl.close();
}
startCalculator();
// This code is a simple calculator that performs basic arithmetic operations.