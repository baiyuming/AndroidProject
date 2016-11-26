package pub.weber.bym.criminalintent;

import java.util.UUID;

/**
 * Created by BYM on 2016/11/25.
 */

public class Crime {
    private UUID mId;
    private String mTitle;
    public Crime(){
        mId = UUID.randomUUID();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }
}
