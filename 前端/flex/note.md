单父盒子设为flex之后，子元素的float，clear，vertical_align属性将会失效

采用flex布局的元素，称为flex容器（flex container），下面的所有子元素称为flex项目(flex item)

flex原理就是通过给父盒子添加flex属性，控制子盒子的位置和排列方式

常见的父项属性（子元素是跟着主轴去排列的）
flex-direction：设置主轴的方向，row：x方向，column：y方向

justify-content：设置主轴上子元素的排列方式
justify-content：属性
flex-start(默认属性)：从头部开始排列，如果主轴是x轴，则从左到右
flex-end：：从尾部开始排列
center：在主轴居中对齐，如果主轴是x轴，则水平居中
space-between：先两边贴边，在平分剩余空间
space-around：平分剩余空间
space-evenly: 均匀排列每个元素,每个元素之间的间隔相等

flex-wrap：设置主轴上子元素是否换行
nowrap：不换行
wrap：换行

align-content：设置侧轴上子元素的排列方式（多行(换行的情况)）
flex-start(默认属性)：从头部开始排列
flex-end：：从尾部开始排列
center：居中对齐，
space-between：子元素先在侧轴分布在两头，再平分剩余空间
space-around：在平分剩余空间
stretch：设置子元素高度平分父元素高度

align-item：设置侧轴上子元素的排列方式（单行）
align-item：属性
flex-start(默认属性)从头部开始排列
flex-end：：从尾部开始排列
center：居中对齐
stretch：拉伸，父元素设置该属性的时候，子元素不要给高度，不然没有效果

flex-flow：复合属性，相当于设置了flex-direction和flex-wrap


常见flex布局的子元素属性
flex：子元素分配剩余空间，用flex表示占用份数
align-self:控制子元素自己在侧轴排列方式
order：控制子元素所在位置