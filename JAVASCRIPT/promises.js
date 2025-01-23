function x(){
    return new Promise((resolve,reject)=>{
       let rndm=  Math.random();

       if(rndm<0.2){
      
        reject("coin fell off the table");
       }
       else{
        const result = rndm<0.5 ? "heads":"tails";
       
resolve(result);    
}
    
    });
}

x()
    .then(result => {
        console.log("Result:", result);
    })
    .catch(error => {
        console.error("Error:", error);
    });



    async function hlo(){
          await x();
          await x();
          await x();
          await x();
          await x();
    }
