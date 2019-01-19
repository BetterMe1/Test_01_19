package xust;

/*
1.最长公共前缀
 编写一个函数来查找字符串数组中的最长公共前缀。
如果不存在公共前缀，返回空字符串 ""。

示例 1:
输入: ["flower","flow","flight"]
输出: "fl"

示例 2:
输入: ["dog","racecar","car"]
输出: ""
解释: 输入不存在公共前缀。

说明:
所有输入只包含小写字母 a-z 。
 */
//public class Test_0119 {
//	public static void main(String[] args){
//		Solution So =new Solution();
//		//测试
//		String[] strs={"flower","flow","flight"};
//		//打印数组内容
//		for(int i=0; i<strs.length; i++){
//			System.out.print(strs[i]+" ");
//		}
//		System.out.println();
//		if((So.longestCommonPrefix(strs)).equals("")){
//			System.out.println("无公共前缀");
//		}
//		else{
//			System.out.println("最长公共前缀:"+So.longestCommonPrefix(strs));
//		}	
//		String[] strs1={"dog","racecar","car"};	
//		for(int i=0; i<strs1.length; i++){
//			System.out.print(strs1[i]+" ");
//		}
//		System.out.println();
//		if((So.longestCommonPrefix(strs1)).equals("")){
//			System.out.println("无公共前缀");
//		}
//		else{
//			System.out.println("最长公共前缀:"+So.longestCommonPrefix(strs1));
//		}
//	}
//}
//
///*
// * 算法思想：先判断数组长度，数组长度为0时返回空字符串，为1时返回第一个字符串，若不是，
// * 先用一个变量s记录下标为0的字符串，接着与下一个字符串进行比较，将前缀相同的存入ret中，比较完一次，
// * 判断有没有进行到最后一位，如果没有，将ret赋给s,ret清空，再接着进行下一次比较，比较完毕，返回ret.
// */
//class Solution {
//    public String longestCommonPrefix(String[] strs) {
//    	if(strs.length==0){
//    		return "";
//    	}
//    	String s = strs[0];
//    	String ret ="";
//        for(int i=1; i<strs.length; i++){
//        	for(int j=0; j<s.length() && j<strs[i].length(); j++){
//        		if((s.charAt(j)+"").equals(strs[i].charAt(j)+"")){
//        			ret = ret + String.valueOf(s.charAt(j));
//        		}
//        		else{
//        			break;
//        		}
//        	}
//        	if(i != strs.length-1){
//        		s = ret;
//        		ret="";
//        	}
//        }
//        if(strs.length==1){
//        	return s;
//        }
//        return ret;
//    }
//}

/*
2.移除元素
给定一个数组 nums 和一个值 val，你需要原地移除所有数值等于 val 的元素，返回移除后数组的新长度。
不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。

示例 1:
给定 nums = [3,2,2,3], val = 3,
函数应该返回新的长度 2, 并且 nums 中的前两个元素均为 2。
你不需要考虑数组中超出新长度后面的元素。

示例 2:
给定 nums = [0,1,2,2,3,0,4,2], val = 2,
函数应该返回新的长度 5, 并且 nums 中的前五个元素为 0, 1, 3, 0, 4。
注意这五个元素可为任意顺序。
你不需要考虑数组中超出新长度后面的元素。

说明:
为什么返回数值是整数，但输出的答案是数组呢?
请注意，输入数组是以“引用”方式传递的，这意味着在函数里修改输入数组对于调用者是可见的。
你可以想象内部操作如下:
// nums 是以“引用”方式传递的。也就是说，不对实参作任何拷贝
int len = removeElement(nums, val);
// 在函数里修改输入数组对于调用者是可见的。
// 根据你的函数返回的长度, 它会打印出数组中该长度范围内的所有元素。
for (int i = 0; i < len; i++) {
    print(nums[i]);
}
 */
public class Test_0119 {
	public static void main(String[] args){
		Solution So=new Solution();
		int[] nums={0,1,2,2,3,0,4,2};
		int val=2;
		int len=So.removeElement(nums, val);
		System.out.println("数组长度为："+len);
		//打印数组内容
		for(int i=0; i<len; i++){
			System.out.print(nums[i]+"  ");
		}
	}
}
/*
算法思想：
 先判断数组长度，如果是0，则直接返回0，
 如果不是，则进行下面的操作：
 用i标记移除元素后数组的下标，用j遍历数组内容与移除元素val进行比较，
 若不同，则赋值给i，并将i后移一位，直到遍历完数组内容，返回i。
 */
class Solution {
    public int removeElement(int[] nums, int val) {
    	int i=0;
    	for(int j=0; j<nums.length; j++){
    		if(nums[j] != val){
    			nums[i]=nums[j];
    			i++;
    		}
    	}
    	return i;
    }
}