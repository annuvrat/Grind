function removeDuplicates(arr) {
  const counts = {}; // Step 1: Count occurrences

  // Count how many times each number appears
  for (let num of arr) {
    if (counts[num]) {
      counts[num] += 1; // Increase count if it already exists
    } else {
      counts[num] = 1; // Initialize count to 1
    }
  }

  // Step 2: Keep only numbers that appear once
  return arr.filter((num) => counts[num] === 1);
}

// Example
const numbers = [1, 2, 3, 2, 4, 5, 5, 6];
const result = removeDuplicates(numbers);

console.log(result); // Output: [1, 3, 4, 6]
