package com.gaidz.aplikasipakarkenakalanremaja;

import android.os.Parcel;
import android.os.Parcelable;

public class SliderItem implements Parcelable {
    private String ImageUrl;

    public static final Creator<SliderItem> CREATOR = new Creator<SliderItem>() {
        @Override
        public SliderItem createFromParcel(Parcel in) {
            return new SliderItem(in);
        }

        @Override
        public SliderItem[] newArray(int size) {
            return new SliderItem[size];
        }
    };

    protected SliderItem(Parcel in) {
        ImageUrl = in.readString();
    }

    public SliderItem() {

    }

    public String getImageUrl() {
        return ImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        ImageUrl = imageUrl;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(ImageUrl);
    }
}
