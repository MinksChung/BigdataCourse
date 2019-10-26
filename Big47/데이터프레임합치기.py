import pandas as pd
df1 = pd.DataFrame({"key":[1,2,3,4,5], "items":[10,20,30,40,50]})
df2 = pd.DataFrame({"key":[6,7,8,9,10], "items":[60,70,80,90,100]})
df3 = pd.concat(df1, df2)
print(df3)