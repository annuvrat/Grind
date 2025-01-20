 let name = 'annuvrat sharma'
        let surname = 'sharma'
     console.log("name");
     console.log(`${name}`);
     console.log(name.length);
     let conacte =  name.concat("",surname);
     console.log(conacte)

     
    





let day = 2;
let dayname;

switch(day){
    case 1:
    dayname = 'monday';
    break;

    case 2:
    dayname = 'tuesday';
    break
}
console.log(dayname);
let count = 1;
while (count <= 5) {
  console.log(count);
  count++;
}
let counter = 1;
do{
    console.log(counter);
    counter ++;
}
while (counter<=5);


function isPrime(num) {
    if (num <= 1) return false; // 0 and 1 are not prime numbers
    for (let i = 2; i <= Math.sqrt(num); i++) {
        if (num % i === 0) return false; // Divisible by another number
    }
    return true;
          
    
function isOdd(num) {
    return num % 2 !== 0; // Odd numbers are not divisible by 2

}
const number =17;


if (isPrime(number)) {
    console.log(`${number} is a prime number.`);
} else if (isOdd(number)) {
    console.log(`${number} is an odd number.`);
} else {
    console.log(`${number} is neither prime nor odd.`);
}
    
}
console.log();

let value;

if (value === null) {
  console.log("Value is null");
}

if (typeof value === "undefined") {
  console.log("Value is undefined");
}


function evenorodd (num){

    

    if(num%2===0){
        console.log("it is a even number");
    }
    else{
        console.log("it is a odd number");
    }

}
evenorodd(264);

const sum =(a,b)=>{

    const addition = a+b;
console.log(addition);


}
console.log(sum(2,4));


for(i=0;i<=10;i++){
    console.log(i);
}
if(null || undefined ) { console.log('null is true'); } else { console.log('null is false'); }

console.log(a)


var add = (a)=> a*a;

console.log(add(5));    

function f() {
    if (true) {
        const b = 9

        // It prints 9
        console.log(b);
    }

    // It gives error as it
    // defined in if block
    console.log(b);
}
f()

// It prints 10
console.log(a)

const a =2;
let b = 2;

 console.log(a==b);

 d = 5;
 console.log(d);
