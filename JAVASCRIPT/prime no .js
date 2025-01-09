function prime(num){
    
    if(num<2) return false;
    
      if (num === 2) return true;
    
    // Even numbers greater than 2 are not prime
    if (num % 2 === 0) return false;
    for(i=3;i<=Math.sqrt(num);i += 2){
        
           if(num%i ===0) return false;
    }
    
        return true;
    
    
    
}

console.log(prime(4));
