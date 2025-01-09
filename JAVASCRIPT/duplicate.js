function duplicate(input_array){
    let duplicate_array = [];
    
    for(num in input_array){
        for(num2 in input_array){
            if(num === num2){
                continue
            }
            else{
                if(input_array[num] === input_array[num2]){
                    duplicate_array.push(input_array[num]);
                }
            }
        }
    }
    return[...new Set (duplicate_array)];
}

let input_array = [1,1,2,3,4,4,5,6,4,5,7];

console.log(duplicate(input_array));
