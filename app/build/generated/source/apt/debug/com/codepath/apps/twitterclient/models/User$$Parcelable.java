
package com.codepath.apps.twitterclient.models;

import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.parceler.Generated;
import org.parceler.IdentityCollection;
import org.parceler.ParcelWrapper;
import org.parceler.ParcelerRuntimeException;

@Generated(value = "org.parceler.ParcelAnnotationProcessor", date = "2017-03-10T21:51+0800")
@SuppressWarnings({
    "unchecked",
    "deprecation"
})
public class User$$Parcelable
    implements Parcelable, ParcelWrapper<com.codepath.apps.twitterclient.models.User>
{

    private com.codepath.apps.twitterclient.models.User user$$0;
    @SuppressWarnings("UnusedDeclaration")
    public final static Creator<User$$Parcelable>CREATOR = new Creator<User$$Parcelable>() {


        @Override
        public User$$Parcelable createFromParcel(android.os.Parcel parcel$$2) {
            return new User$$Parcelable(read(parcel$$2, new IdentityCollection()));
        }

        @Override
        public User$$Parcelable[] newArray(int size) {
            return new User$$Parcelable[size] ;
        }

    }
    ;

    public User$$Parcelable(com.codepath.apps.twitterclient.models.User user$$2) {
        user$$0 = user$$2;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel$$0, int flags) {
        write(user$$0, parcel$$0, flags, new IdentityCollection());
    }

    public static void write(com.codepath.apps.twitterclient.models.User user$$1, android.os.Parcel parcel$$1, int flags$$0, IdentityCollection identityMap$$0) {
        int identity$$0 = identityMap$$0 .getKey(user$$1);
        if (identity$$0 != -1) {
            parcel$$1 .writeInt(identity$$0);
        } else {
            parcel$$1 .writeInt(identityMap$$0 .put(user$$1));
            if (user$$1 .showAllInlineMedia == null) {
                parcel$$1 .writeInt(-1);
            } else {
                parcel$$1 .writeInt(1);
                parcel$$1 .writeInt((user$$1 .showAllInlineMedia? 1 : 0));
            }
            if (user$$1 .geoEnabled == null) {
                parcel$$1 .writeInt(-1);
            } else {
                parcel$$1 .writeInt(1);
                parcel$$1 .writeInt((user$$1 .geoEnabled? 1 : 0));
            }
            parcel$$1 .writeString(user$$1 .profileTextColor);
            parcel$$1 .writeString(user$$1 .description);
            if (user$$1 .contributorsEnabled == null) {
                parcel$$1 .writeInt(-1);
            } else {
                parcel$$1 .writeInt(1);
                parcel$$1 .writeInt((user$$1 .contributorsEnabled? 1 : 0));
            }
            parcel$$1 .writeString(user$$1 .screenName);
            if (user$$1 .profileUseBackgroundImage == null) {
                parcel$$1 .writeInt(-1);
            } else {
                parcel$$1 .writeInt(1);
                parcel$$1 .writeInt((user$$1 .profileUseBackgroundImage? 1 : 0));
            }
            parcel$$1 .writeString(user$$1 .createdAt);
            parcel$$1 .writeString(user$$1 .profileBackgroundImageUrl);
            if (user$$1 ._protected == null) {
                parcel$$1 .writeInt(-1);
            } else {
                parcel$$1 .writeInt(1);
                parcel$$1 .writeInt((user$$1 ._protected? 1 : 0));
            }
            if (user$$1 .id == null) {
                parcel$$1 .writeInt(-1);
            } else {
                parcel$$1 .writeInt(1);
                parcel$$1 .writeLong(user$$1 .id);
            }
            parcel$$1 .writeString(user$$1 .lang);
            parcel$$1 .writeString(user$$1 .profileImageUrl);
            if (user$$1 .defaultProfileImage == null) {
                parcel$$1 .writeInt(-1);
            } else {
                parcel$$1 .writeInt(1);
                parcel$$1 .writeInt((user$$1 .defaultProfileImage? 1 : 0));
            }
            parcel$$1 .writeString(user$$1 .profileSidebarBorderColor);
            parcel$$1 .writeString(user$$1 .idStr);
            if (user$$1 .statusesCount == null) {
                parcel$$1 .writeInt(-1);
            } else {
                parcel$$1 .writeInt(1);
                parcel$$1 .writeInt(user$$1 .statusesCount);
            }
            if (user$$1 .utcOffset == null) {
                parcel$$1 .writeInt(-1);
            } else {
                parcel$$1 .writeInt(1);
                parcel$$1 .writeInt(user$$1 .utcOffset);
            }
            if (user$$1 .profileBackgroundTile == null) {
                parcel$$1 .writeInt(-1);
            } else {
                parcel$$1 .writeInt(1);
                parcel$$1 .writeInt((user$$1 .profileBackgroundTile? 1 : 0));
            }
            parcel$$1 .writeString(user$$1 .profileBackgroundImageUrlHttps);
            parcel$$1 .writeString(user$$1 .profileBackgroundColor);
            if (user$$1 .verified == null) {
                parcel$$1 .writeInt(-1);
            } else {
                parcel$$1 .writeInt(1);
                parcel$$1 .writeInt((user$$1 .verified? 1 : 0));
            }
            if (user$$1 .favouritesCount == null) {
                parcel$$1 .writeInt(-1);
            } else {
                parcel$$1 .writeInt(1);
                parcel$$1 .writeInt(user$$1 .favouritesCount);
            }
            parcel$$1 .writeString(user$$1 .timeZone);
            if (user$$1 .defaultProfile == null) {
                parcel$$1 .writeInt(-1);
            } else {
                parcel$$1 .writeInt(1);
                parcel$$1 .writeInt((user$$1 .defaultProfile? 1 : 0));
            }
            if (user$$1 .friendsCount == null) {
                parcel$$1 .writeInt(-1);
            } else {
                parcel$$1 .writeInt(1);
                parcel$$1 .writeInt(user$$1 .friendsCount);
            }
            parcel$$1 .writeString(user$$1 .profileLinkColor);
            if (user$$1 .isTranslator == null) {
                parcel$$1 .writeInt(-1);
            } else {
                parcel$$1 .writeInt(1);
                parcel$$1 .writeInt((user$$1 .isTranslator? 1 : 0));
            }
            if (user$$1 .listedCount == null) {
                parcel$$1 .writeInt(-1);
            } else {
                parcel$$1 .writeInt(1);
                parcel$$1 .writeInt(user$$1 .listedCount);
            }
            parcel$$1 .writeString(user$$1 .url);
            parcel$$1 .writeString(user$$1 .profileSidebarFillColor);
            parcel$$1 .writeString(user$$1 .profileImageUrlHttps);
            if (user$$1 .following == null) {
                parcel$$1 .writeInt(-1);
            } else {
                parcel$$1 .writeInt(1);
                parcel$$1 .writeInt((user$$1 .following? 1 : 0));
            }
            parcel$$1 .writeString(user$$1 .name);
            parcel$$1 .writeString(user$$1 .location);
            if (user$$1 .followersCount == null) {
                parcel$$1 .writeInt(-1);
            } else {
                parcel$$1 .writeInt(1);
                parcel$$1 .writeInt(user$$1 .followersCount);
            }
            if (user$$1 .notifications == null) {
                parcel$$1 .writeInt(-1);
            } else {
                parcel$$1 .writeInt(1);
                parcel$$1 .writeInt((user$$1 .notifications? 1 : 0));
            }
            if (user$$1 .followRequestSent == null) {
                parcel$$1 .writeInt(-1);
            } else {
                parcel$$1 .writeInt(1);
                parcel$$1 .writeInt((user$$1 .followRequestSent? 1 : 0));
            }
        }
    }

    @Override
    public int describeContents() {
        return  0;
    }

    @Override
    public com.codepath.apps.twitterclient.models.User getParcel() {
        return user$$0;
    }

    public static com.codepath.apps.twitterclient.models.User read(android.os.Parcel parcel$$3, IdentityCollection identityMap$$1) {
        int identity$$1 = parcel$$3 .readInt();
        if (identityMap$$1 .containsKey(identity$$1)) {
            if (identityMap$$1 .isReserved(identity$$1)) {
                throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
            }
            return identityMap$$1 .get(identity$$1);
        } else {
            com.codepath.apps.twitterclient.models.User user$$4;
            int reservation$$0 = identityMap$$1 .reserve();
            user$$4 = new com.codepath.apps.twitterclient.models.User();
            identityMap$$1 .put(reservation$$0, user$$4);
            int int$$0 = parcel$$3 .readInt();
            java.lang.Boolean boolean$$0;
            if (int$$0 < 0) {
                boolean$$0 = null;
            } else {
                boolean$$0 = (parcel$$3 .readInt() == 1);
            }
            user$$4 .showAllInlineMedia = boolean$$0;
            int int$$1 = parcel$$3 .readInt();
            java.lang.Boolean boolean$$1;
            if (int$$1 < 0) {
                boolean$$1 = null;
            } else {
                boolean$$1 = (parcel$$3 .readInt() == 1);
            }
            user$$4 .geoEnabled = boolean$$1;
            user$$4 .profileTextColor = parcel$$3 .readString();
            user$$4 .description = parcel$$3 .readString();
            int int$$2 = parcel$$3 .readInt();
            java.lang.Boolean boolean$$2;
            if (int$$2 < 0) {
                boolean$$2 = null;
            } else {
                boolean$$2 = (parcel$$3 .readInt() == 1);
            }
            user$$4 .contributorsEnabled = boolean$$2;
            user$$4 .screenName = parcel$$3 .readString();
            int int$$3 = parcel$$3 .readInt();
            java.lang.Boolean boolean$$3;
            if (int$$3 < 0) {
                boolean$$3 = null;
            } else {
                boolean$$3 = (parcel$$3 .readInt() == 1);
            }
            user$$4 .profileUseBackgroundImage = boolean$$3;
            user$$4 .createdAt = parcel$$3 .readString();
            user$$4 .profileBackgroundImageUrl = parcel$$3 .readString();
            int int$$4 = parcel$$3 .readInt();
            java.lang.Boolean boolean$$4;
            if (int$$4 < 0) {
                boolean$$4 = null;
            } else {
                boolean$$4 = (parcel$$3 .readInt() == 1);
            }
            user$$4 ._protected = boolean$$4;
            int int$$5 = parcel$$3 .readInt();
            Long long$$0;
            if (int$$5 < 0) {
                long$$0 = null;
            } else {
                long$$0 = parcel$$3 .readLong();
            }
            user$$4 .id = long$$0;
            user$$4 .lang = parcel$$3 .readString();
            user$$4 .profileImageUrl = parcel$$3 .readString();
            int int$$6 = parcel$$3 .readInt();
            java.lang.Boolean boolean$$5;
            if (int$$6 < 0) {
                boolean$$5 = null;
            } else {
                boolean$$5 = (parcel$$3 .readInt() == 1);
            }
            user$$4 .defaultProfileImage = boolean$$5;
            user$$4 .profileSidebarBorderColor = parcel$$3 .readString();
            user$$4 .idStr = parcel$$3 .readString();
            int int$$7 = parcel$$3 .readInt();
            java.lang.Integer integer$$0;
            if (int$$7 < 0) {
                integer$$0 = null;
            } else {
                integer$$0 = parcel$$3 .readInt();
            }
            user$$4 .statusesCount = integer$$0;
            int int$$8 = parcel$$3 .readInt();
            java.lang.Integer integer$$1;
            if (int$$8 < 0) {
                integer$$1 = null;
            } else {
                integer$$1 = parcel$$3 .readInt();
            }
            user$$4 .utcOffset = integer$$1;
            int int$$9 = parcel$$3 .readInt();
            java.lang.Boolean boolean$$6;
            if (int$$9 < 0) {
                boolean$$6 = null;
            } else {
                boolean$$6 = (parcel$$3 .readInt() == 1);
            }
            user$$4 .profileBackgroundTile = boolean$$6;
            user$$4 .profileBackgroundImageUrlHttps = parcel$$3 .readString();
            user$$4 .profileBackgroundColor = parcel$$3 .readString();
            int int$$10 = parcel$$3 .readInt();
            java.lang.Boolean boolean$$7;
            if (int$$10 < 0) {
                boolean$$7 = null;
            } else {
                boolean$$7 = (parcel$$3 .readInt() == 1);
            }
            user$$4 .verified = boolean$$7;
            int int$$11 = parcel$$3 .readInt();
            java.lang.Integer integer$$2;
            if (int$$11 < 0) {
                integer$$2 = null;
            } else {
                integer$$2 = parcel$$3 .readInt();
            }
            user$$4 .favouritesCount = integer$$2;
            user$$4 .timeZone = parcel$$3 .readString();
            int int$$12 = parcel$$3 .readInt();
            java.lang.Boolean boolean$$8;
            if (int$$12 < 0) {
                boolean$$8 = null;
            } else {
                boolean$$8 = (parcel$$3 .readInt() == 1);
            }
            user$$4 .defaultProfile = boolean$$8;
            int int$$13 = parcel$$3 .readInt();
            java.lang.Integer integer$$3;
            if (int$$13 < 0) {
                integer$$3 = null;
            } else {
                integer$$3 = parcel$$3 .readInt();
            }
            user$$4 .friendsCount = integer$$3;
            user$$4 .profileLinkColor = parcel$$3 .readString();
            int int$$14 = parcel$$3 .readInt();
            java.lang.Boolean boolean$$9;
            if (int$$14 < 0) {
                boolean$$9 = null;
            } else {
                boolean$$9 = (parcel$$3 .readInt() == 1);
            }
            user$$4 .isTranslator = boolean$$9;
            int int$$15 = parcel$$3 .readInt();
            java.lang.Integer integer$$4;
            if (int$$15 < 0) {
                integer$$4 = null;
            } else {
                integer$$4 = parcel$$3 .readInt();
            }
            user$$4 .listedCount = integer$$4;
            user$$4 .url = parcel$$3 .readString();
            user$$4 .profileSidebarFillColor = parcel$$3 .readString();
            user$$4 .profileImageUrlHttps = parcel$$3 .readString();
            int int$$16 = parcel$$3 .readInt();
            java.lang.Boolean boolean$$10;
            if (int$$16 < 0) {
                boolean$$10 = null;
            } else {
                boolean$$10 = (parcel$$3 .readInt() == 1);
            }
            user$$4 .following = boolean$$10;
            user$$4 .name = parcel$$3 .readString();
            user$$4 .location = parcel$$3 .readString();
            int int$$17 = parcel$$3 .readInt();
            java.lang.Integer integer$$5;
            if (int$$17 < 0) {
                integer$$5 = null;
            } else {
                integer$$5 = parcel$$3 .readInt();
            }
            user$$4 .followersCount = integer$$5;
            int int$$18 = parcel$$3 .readInt();
            java.lang.Boolean boolean$$11;
            if (int$$18 < 0) {
                boolean$$11 = null;
            } else {
                boolean$$11 = (parcel$$3 .readInt() == 1);
            }
            user$$4 .notifications = boolean$$11;
            int int$$19 = parcel$$3 .readInt();
            java.lang.Boolean boolean$$12;
            if (int$$19 < 0) {
                boolean$$12 = null;
            } else {
                boolean$$12 = (parcel$$3 .readInt() == 1);
            }
            user$$4 .followRequestSent = boolean$$12;
            com.codepath.apps.twitterclient.models.User user$$3 = user$$4;
            identityMap$$1 .put(identity$$1, user$$3);
            return user$$3;
        }
    }

}
