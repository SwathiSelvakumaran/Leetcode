/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var filter = function(arr, fn) {
    const mappedArray = [];
  for (let i = 0; i < arr.length; i++) {
      if(fn(arr[i], i))
        mappedArray.push(arr[i]);
  
  }
  return mappedArray;
};