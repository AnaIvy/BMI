public class Bmiservice {
    float index;

    public float calculate(float weight, float hight) {
        index = weight / (hight * hight);
        return index;
    }
}
