package Sekcja5.Exercises;

public class Exercise28PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBucket){
        if (width <= 0 || height <=0 || areaPerBucket <=0 || extraBucket < 0){
            return -1;
        } else {
            return (int) Math.ceil(((width * height)/areaPerBucket) - (extraBucket));
        }
    }
    public static int getBucketCount(double width, double height, double areaPerBucket){
        if (width <= 0 || height <=0 || areaPerBucket <=0){
            return -1;
        } else {
            return (int) Math.ceil((width * height)/areaPerBucket);
        }
    }

    public static int getBucketCount(double area, double areaPerBucket){
        if (area <= 0 || areaPerBucket <=0){
            return -1;
        } else {
            return (int) Math.ceil(area/areaPerBucket);
        }
    }

    public static void main(String[] args) {
        System.out.println(getBucketCount(-3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(3.4, 2.1, 1.5));
        System.out.println(getBucketCount(3.4,1.5));
    }
}
