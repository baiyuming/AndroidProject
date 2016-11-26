package pub.weber.bym.criminalintent;


import android.content.Context;

/**
 * Created by BYM on 2016/11/26.
 */

public class CrimeLab {
    private static CrimeLab sCrimeLab;

    public static CrimeLab get(Context context){
        if (sCrimeLab == null){
            sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;
    }
    private CrimeLab(Context context) {
    }
}
