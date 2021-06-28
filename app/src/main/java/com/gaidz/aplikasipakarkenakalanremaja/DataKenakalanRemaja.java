package com.gaidz.aplikasipakarkenakalanremaja;


import android.os.Parcel;
import android.os.Parcelable;

public class DataKenakalanRemaja implements Parcelable {
    private String id;
    private String image;
    private String name;
    private String description;
    private String definition;

    protected DataKenakalanRemaja(Parcel in) {
        id = in.readString();
        image = in.readString();
        name = in.readString();
        description = in.readString();
        definition = in.readString();
    }

    public static final Creator<DataKenakalanRemaja> CREATOR = new Creator<DataKenakalanRemaja>() {
        @Override
        public DataKenakalanRemaja createFromParcel(Parcel in) {
            return new DataKenakalanRemaja(in);
        }

        @Override
        public DataKenakalanRemaja[] newArray(int size) {
            return new DataKenakalanRemaja[size];
        }
    };

    public DataKenakalanRemaja() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(id);
        parcel.writeString(image);
        parcel.writeString(name);
        parcel.writeString(description);
        parcel.writeString(definition);
    }
}
