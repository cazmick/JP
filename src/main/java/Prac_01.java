import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.StandardSocketOptions;
import java.util.*;

public class Prac_01 {


    public Set<String> getConfigKeyValue(){
        String propFileName = "./config.properties";

        File file = new File(propFileName);

        FileInputStream fileInput = null;

        try {
            fileInput = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Properties prop = new Properties();

        try {
            prop.load(fileInput);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Set<String> propSet = prop.stringPropertyNames();
        for(String key : propSet){
            String value = prop.getProperty(key);

        }
        return propSet;
    }

    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                result[1] = i;
                result[0] = map.get(target - numbers[i]);
                return result;
            }
            map.put(numbers[i], i);
        }
        return result;
    }

    @Test
    public void toSum(){
        int [ ] tem = twoSum(new int[]{4,6,8,9,1},15);
        System.out.println(tem[0] + "  "+ tem[1]);
    }

    public static void main(String args[]){
//        Prac_01 prac = new Prac_01();

//        Set<String> set = prac.getConfigKeyValue();
//        System.out.println(set);
        String pcloudyDeviceName="wGoogle_PixelXL_Android_9.0.0_10318,Oneplus_NordCE_Android_11.0.0_ec9a6,Samsung_GalaxyS10Plus_Android_12.0.0_d675f,Samsung_GalaxyNote8_Android_9.0.0_054a0,Samsung_GalaxyA72_Android_12.0.0_b7dee,Samsung_GalaxyFold_Android_9.0.0_f3828,Samsung_GalaxyM53_Android_12.0.0_7c94f,Samsung_GalaxyM53_Android_12.0.0_2b97c,Samsung_F42_Android_12.0.0_f8ffb,Samsung_GalaxyM51_Android_12.0.0_946de,Samsung_GalaxyA50_Android_11.0.0_fde74,Samsung_GalaxyF12_Android_12.0.0_54b4d,Samsung_GalaxyM11_Android_12.0.0_beccf,Google_PixelXL_Android_9.0.0_10318,Samsung_GalaxyA03_Android_11.0.0_282d4,Samsung_GalaxyA73_Android_12.0.0_bd90e,Samsung_GalaxyNote10Plus_Android_12.0.0_b2d4f";

//        String pcloudyDeviceName="Samsung_GalaxyS10Plus_Android_12.0.0_d675f,Samsung_GalaxyNote8_Android_9.0.0_054a0,Samsung_GalaxyNote10Plus_Android_12.0.0_b2d4fSamsung_GalaxyA72_Android_12.0.0_b7dee,Samsung_GalaxyFold_Android_9.0.0_f3828,Samsung_GalaxyM53_Android_12.0.0_7c94f,Samsung_GalaxyM53_Android_12.0.0_2b97c,Samsung_F42_Android_12.0.0_f8ffb,Oneplus_NordCE_Android_11.0.0_ec9a6,Samsung_GalaxyM51_Android_12.0.0_946de,Samsung_GalaxyA50_Android_11.0.0_fde74,Samsung_GalaxyF12_Android_12.0.0_54b4d,Samsung_GalaxyM11_Android_12.0.0_beccf,Google_PixelXL_Android_9.0.0_10318,Samsung_GalaxyA03_Android_11.0.0_282d4,Samsung_GalaxyA73_Android_12.0.0_bd90e,Huawei_Honor20i_Android_10.0.0_1d664,Oneplus_9_Android_12.0.0_21c50,Samsung_GalaxyS10Plus_Android_12.0.0_d675f,Google_Pixel2XL_Android_11.0.0_d22ac,Samsung_GalaxyNote9_Android_10.0.0_6b251,Samsung_GalaxyA51_Android_12.0.0_d52ba,Google_PixelXL_Android_10.0.0_53dda,Google_Pixel5_Android_11.0.0_21d59,Google_Pixel3_Android_12.0.0_a6091,Google_Pixel6_Android_12.0.0_1c082,Samsung_GalaxyA12_Android_11.0.0_334bc,Samsung_GalaxyNote8_Android_9.0.0_054a0,Samsung_GalaxyNote10Plus_Android_12.0.0_b2d4fSamsung_GalaxyA72_Android_12.0.0_b7dee,Samsung_GalaxyFold_Android_9.0.0_f3828,Samsung_GalaxyM53_Android_12.0.0_7c94f,Samsung_GalaxyM53_Android_12.0.0_2b97c,Samsung_F42_Android_12.0.0_f8ffb,Oneplus_NordCE_Android_11.0.0_ec9a6,Samsung_GalaxyM51_Android_12.0.0_946de,Samsung_GalaxyA50_Android_11.0.0_fde74,Samsung_GalaxyF12_Android_12.0.0_54b4d,Samsung_GalaxyM11_Android_12.0.0_beccf,Google_PixelXL_Android_9.0.0_10318,Samsung_GalaxyA03_Android_11.0.0_282d4,Samsung_GalaxyA73_Android_12.0.0_bd90e,Huawei_Honor20i_Android_10.0.0_1d664,Oneplus_9_Android_12.0.0_21c50,Google_Pixel2XL_Android_11.0.0_d22ac,SAMSUNG_GalaxyM10_Android_10.0.0_a58e4,Samsung_GalaxyJ6_Android_10.0.0_6bc78,Samsung_GalaxyJ4Plus_Android_9.0.0_94cc6,Samsung_GalaxyJ6_Android_10.0.0_482da,Google_PixelXL_Android_10.0.0_53dda,Samsung_GalaxyA51_Android_12.0.0_d52ba,Google_Pixel6_Android_12.0.0_1c082,Samsung_GalaxyM02_Android_11.0.0_51323,Samsung_GalaxyA31_Android_11.0.0_32c0a,Samsung_GalaxyA12_Android_11.0.0_334bc,Google_Pixel5_Android_11.0.0_21d59,ONEPLUS_7Pro_Android_10.0.0_b2d65,Samsung_GalaxyA9_Android_10.0.0_6eed1,Samsung_GalaxyS8Plus_Android_9.0.0_2e32c,Samsung_GalaxyNote9_Android_10.0.0_6b251,Samsung_GalaxyM02_Android_10.0.0_51323,SAMSUNG_GalaxyA10s_Android_10.0.0_09401,SAMSUNG_GalaxyA51_Android_10.0.0_d52ba,Samsung_GalaxyJ6_Android_10.0.0_482da,Samsung_GalaxyNote9_Android_10.0.0_ecbb4,Samsung_GalaxyJ8_Android_10.0.0_882d2,Samsung_GalaxyS9_Android_9.0.0_5a534,Samsung_GalaxyNote10_Android_10.0.0_f34e3,Samsung_GalaxyNote20_Android_12.0.0_765c8,Samsung_GalaxyA10s_Android_11.0.0_99cde,Samsung_GalaxyA72018_Android_10.0.0_ef0ba,Samsung_GalaxyNote20_Android_12.0.0_dd2e9,Samsung_GalaxyS10_Android_9.0.0_01e83,Google_Pixel3_Android_12.0.0_a6091,Vivo_Y50_Android_10.0.0_6b4f5,Motorola_MOTOROLA_Android_12.0.0_15b11,Huawei_P20Pro_Android_10.0.0_dec7f,Huawei_P20Pro_Android_10.0.0_dec7f";
        String[] devices = pcloudyDeviceName.split(",");
        Set<String> uniqueDevice = new HashSet<>();
        uniqueDevice.addAll(List.of(devices));

        System.out.println(uniqueDevice);

        String unique="";
        for(String a : uniqueDevice){

            unique+=a +",";
        }
        System.out.println(unique);


        //Data Structures
//        Prac_01 b = new Prac_01();
//        b.BinarySearch();
//        Stack myStack = new Stack(1);
//        System.out.println("Is Empty : "+myStack.isEmpty());
//        System.out.println("Is Full : "+myStack.isFull());
//        myStack.push(2);
//        myStack.push(3);
//        myStack.printStack();
//        myStack.pop();
//        myStack.printStack();

//        Queue myQue = new Queue(5);
//        myQue.display();
//        myQue.deQueue();
//        myQue.display();
//        myQue.enQueue(2);
//        myQue.enQueue(3);
//        myQue.display();
//        myQue.deQueue();
//        myQue.display();

//        DoubleEndQueue doubleEndQueue = new DoubleEndQueue(4);


    }

    public void BinarySearch(){
        System.out.println("BInary Search");
    }

    @Test
    public void MaxArea(){
        int[] a =  { 1, 5, 4, 3 };
        List<Integer> areas = new ArrayList<Integer>();
        for (int i =0;i<a.length; i++){

            for(int j =i+1; j<a.length ; j++){
                if (a[i]<a[j]){
                    areas.add(a[i] * (j-1));
                }else {
                    areas.add(a[j] * (j-1));
                }
            }
        }
        Object[] area = areas.toArray();
        Arrays.sort(area);
        System.out.println(area[area.length-1]);






    }
}
