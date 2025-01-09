function firstNonRepeatingChar(str) {
  const charCount = {};
  
  // First loop: Count occurrences of each character
  for (let char of str) {
    charCount[char] = (charCount[char] || 0) + 1; // Increment count or initialize to 1
  }
  
  // Second loop: Find the first character with a count of 1
  for (let char of str) {
    if (charCount[char] === 1) return char; // Return the first non-repeating character
  }

  return null; // If no non-repeating character exists, return null
}
