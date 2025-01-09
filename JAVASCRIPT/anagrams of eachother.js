function areAnagrams(str1, str2) {
  const sortStr = (str) => str.split('').sort().join('');
  return sortStr(str1) === sortStr(str2);
}
console.log(areAnagrams("listen", "silent")); // true
