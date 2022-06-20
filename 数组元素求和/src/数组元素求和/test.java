package 数组元素求和;
/*需求：有这样一个数组，元素是{68，27，95，171，996，51，210}。求出该数组中满足要求的元素和，
 *      要求是：求和的元素个位和十位都不能是7，并且只能是偶数。
 *
*/

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {68,27,95,171,996,51,210};
		int sum =0;
		for(int x=0;x<arr.length;x++) {
			if(arr[x]%10!=7 && arr[x]/10%10!=7 && arr[x]%2==0) {
				sum+=arr[x];
			}
		}
		System.out.println("该数组满足要求的元素和："+sum);
		

	}

}
