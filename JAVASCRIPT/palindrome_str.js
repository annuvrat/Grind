// Function that check str is palindrome or not 
function check_palindrome(str) {
    let j = str.length - 1;
    for (let i = 0; i < j / 2; i++) {
        let x = str[i];//forward character 
        let y = str[j - i];//backward character
        if (x != y) {
    
            // Return false if string not match
            return false;
        }
    }
    
    // Return true if string is palindrome
    return true;

}

// Function that print output if string is palindrome
function is_palindrome(str) {
    
    // Variable that is true if string is palindrome
    let ans = check_palindrome(str);
    
    // Condition checking ans is true or not 
    if (ans == true) {
        console.log("passed string is palindrome ");
    }
    else {
        console.log("passed string not a palindrome");
    }
}

// Test variable
let test = "racecar";
is_palindrome(test);
