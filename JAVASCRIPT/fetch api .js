     async  function x(){

        let x =await fetch('https://zenquotes.io/api/random');
        let data= await  x.json();
        console.log("Here is the quote of the day");
        console.log(`Quote: "${data[0].q}"`);
        console.log(`Author: ${data[0].a}`);
        // console.log(`More: ${data[0].h}`);
        return data;
  }

//   async function y(){
//     console.log("Here  is the thought of the day");
//    let data = await x();
//     console.log(data);
   

//   }

  x();
