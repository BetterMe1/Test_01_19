package xust;

/*
1.�����ǰ׺
 ��дһ�������������ַ��������е������ǰ׺��
��������ڹ���ǰ׺�����ؿ��ַ��� ""��

ʾ�� 1:
����: ["flower","flow","flight"]
���: "fl"

ʾ�� 2:
����: ["dog","racecar","car"]
���: ""
����: ���벻���ڹ���ǰ׺��

˵��:
��������ֻ����Сд��ĸ a-z ��
 */
//public class Test_0119 {
//	public static void main(String[] args){
//		Solution So =new Solution();
//		//����
//		String[] strs={"flower","flow","flight"};
//		//��ӡ��������
//		for(int i=0; i<strs.length; i++){
//			System.out.print(strs[i]+" ");
//		}
//		System.out.println();
//		if((So.longestCommonPrefix(strs)).equals("")){
//			System.out.println("�޹���ǰ׺");
//		}
//		else{
//			System.out.println("�����ǰ׺:"+So.longestCommonPrefix(strs));
//		}	
//		String[] strs1={"dog","racecar","car"};	
//		for(int i=0; i<strs1.length; i++){
//			System.out.print(strs1[i]+" ");
//		}
//		System.out.println();
//		if((So.longestCommonPrefix(strs1)).equals("")){
//			System.out.println("�޹���ǰ׺");
//		}
//		else{
//			System.out.println("�����ǰ׺:"+So.longestCommonPrefix(strs1));
//		}
//	}
//}
//
///*
// * �㷨˼�룺���ж����鳤�ȣ����鳤��Ϊ0ʱ���ؿ��ַ�����Ϊ1ʱ���ص�һ���ַ����������ǣ�
// * ����һ������s��¼�±�Ϊ0���ַ�������������һ���ַ������бȽϣ���ǰ׺��ͬ�Ĵ���ret�У��Ƚ���һ�Σ�
// * �ж���û�н��е����һλ�����û�У���ret����s,ret��գ��ٽ��Ž�����һ�αȽϣ��Ƚ���ϣ�����ret.
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
2.�Ƴ�Ԫ��
����һ������ nums ��һ��ֵ val������Ҫԭ���Ƴ�������ֵ���� val ��Ԫ�أ������Ƴ���������³��ȡ�
��Ҫʹ�ö��������ռ䣬�������ԭ���޸��������鲢��ʹ�� O(1) ����ռ����������ɡ�
Ԫ�ص�˳����Ըı䡣�㲻��Ҫ���������г����³��Ⱥ����Ԫ�ء�

ʾ�� 1:
���� nums = [3,2,2,3], val = 3,
����Ӧ�÷����µĳ��� 2, ���� nums �е�ǰ����Ԫ�ؾ�Ϊ 2��
�㲻��Ҫ���������г����³��Ⱥ����Ԫ�ء�

ʾ�� 2:
���� nums = [0,1,2,2,3,0,4,2], val = 2,
����Ӧ�÷����µĳ��� 5, ���� nums �е�ǰ���Ԫ��Ϊ 0, 1, 3, 0, 4��
ע�������Ԫ�ؿ�Ϊ����˳��
�㲻��Ҫ���������г����³��Ⱥ����Ԫ�ء�

˵��:
Ϊʲô������ֵ��������������Ĵ���������?
��ע�⣬�����������ԡ����á���ʽ���ݵģ�����ζ���ں������޸�����������ڵ������ǿɼ��ġ�
����������ڲ���������:
// nums ���ԡ����á���ʽ���ݵġ�Ҳ����˵������ʵ�����κο���
int len = removeElement(nums, val);
// �ں������޸�����������ڵ������ǿɼ��ġ�
// ������ĺ������صĳ���, �����ӡ�������иó��ȷ�Χ�ڵ�����Ԫ�ء�
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
		System.out.println("���鳤��Ϊ��"+len);
		//��ӡ��������
		for(int i=0; i<len; i++){
			System.out.print(nums[i]+"  ");
		}
	}
}
/*
�㷨˼�룺
 ���ж����鳤�ȣ������0����ֱ�ӷ���0��
 ������ǣ����������Ĳ�����
 ��i����Ƴ�Ԫ�غ�������±꣬��j���������������Ƴ�Ԫ��val���бȽϣ�
 ����ͬ����ֵ��i������i����һλ��ֱ���������������ݣ�����i��
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