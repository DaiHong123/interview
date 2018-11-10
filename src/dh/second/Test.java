package dh.second;

/**
 * @Description: 金额转换
 * @Author: daihong
 * @Date: Created in  2018/8/30
 */
public class Test {
    public static void main(String[] args){
        int money = 105600123;
        String s = "book";
        
        convent(money);
    }
    public static String convent(int money){
        int sum = 0;
        StringBuilder stringBuilder = new StringBuilder("整");
        stringBuilder.insert(0,"圆");
        char[] chars = {'零','壹','贰','叄','肆','伍','陆','柒','捌','玖','拾'};
        int i = 0;
        int j ;
        while (money!=0){
            sum = money%10;
            if (i==1) {
                stringBuilder.insert(0, '拾');
            }else if (i==2){
                stringBuilder.insert(0,'佰');
            }else if(i==3){
                stringBuilder.insert(0,'仟');
            }else if (i==4){
                stringBuilder.insert(0,'万');
            }else if (i>4&&i<8){
              j = i - 4;
                if (j==1) {
                    stringBuilder.insert(0, '拾');
                }else if (j==2){
                    stringBuilder.insert(0,'佰');
                }else if(j==3){
                    stringBuilder.insert(0,'仟');
                }
            } else if (i==8){
                stringBuilder.insert(0,'亿');
            }else if (8<i&&i<12){
                j = i - 4;
                if (j==1) {
                    stringBuilder.insert(0, '拾');
                }else if (j==2){
                    stringBuilder.insert(0,'佰');
                }else if(j==3){
                    stringBuilder.insert(0,'仟');
                }
            }
            stringBuilder.insert(0,chars[sum]);
            money = money/10;
            i++;
            j=0;
        }
        System.out.println(i);
        System.out.println(stringBuilder);
        return null;
    }
}
