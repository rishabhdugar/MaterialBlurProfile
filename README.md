# MaterialBlurProfile
An Android XML profile layout for dynamic Blurry Background with Circle Image View 

The sample UI looks like below
![Alt text](Screenshot_20190203-221447.png?raw=true "Material Blurry Circular")

It uses Picasso in combincation with some transformation on it to make it circular along with blurry background.

*Circular Image*
```
Picasso.with(mContext)
                .load(pic_url)
                .noFade()
                .placeholder(R.mipmap.ic_placeholder_man)
                .transform(new CircleTransform())
                .into(_imgProfile);
```

*Blurry Image*
```
Picasso.with(mContext).load(pic_url).transform(new BlurTransformation(mContext)).into(mCustomLayout);
```


               
                
                
