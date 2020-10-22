<%--
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>工作台</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="format-detection" content="telephone=no">
    <link rel="stylesheet" href="${yeqifu}/static/layui/css/layui.css" media="all" />
    <link rel="stylesheet" href="${yeqifu}/static/css/public.css" media="all" />

    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="viewport" content="initial-scale=1.0, user-scalable=no" />
    <style type="text/css">
        body, html,#allmap {width: 100%;height: 100%;overflow: hidden;margin:0;font-family:"微软雅黑";}
    </style>
    <script type="text/javascript" src="//api.map.baidu.com/api?type=webgl&v=1.0&ak=q0wOZxAXKWHOcj9xCMi31HP2jXQZfpbp"></script>
    <title>视角动画</title>
</head>
<body>
    <div id="allmap"></div>
</body>
</html>
<script type="text/javascript">
    // GL版命名空间为BMapGL
    // 按住鼠标右键，修改倾斜角和角度
    var bmap = new BMapGL.Map("allmap");    // 创建Map实例
    bmap.centerAndZoom(new BMapGL.Point(120.12956984222501,30.265708522547023), 19);  // 初始化地图,设置中心点坐标和地图级别
    bmap.enableScrollWheelZoom(true);     // 开启鼠标滚轮缩放
    bmap.setTilt(50);      // 设置地图初始倾斜角

    // 定义关键帧
    // 定义关键帧
    var keyFrames = [
        {
            center: new BMapGL.Point(120.12953843112989,30.2651638706503337),
            zoom: 19,
            tilt: 50,
            heading: -20,//11
            percentage: 0
        },
        {
            center: new BMapGL.Point(120.12977556779306,30.265693294120457),
            zoom: 30,
            tilt: 80,
            heading: -20,
            percentage: 0.14//12
        },
        {
            center: new BMapGL.Point(120.12987284887562,30.265920335869193),
            zoom: 30,
            tilt: 70,
            heading: 70,
            percentage: 0.15//转弯1
        },
        {
            center: new BMapGL.Point(120.1296049272056,30.26600478418921),
            zoom: 30,
            tilt: 80,
            heading: 70,
            percentage: 0.25 // 21
        },
        {
            center: new BMapGL.Point(120.1286581170713,30.266321230573684),
            zoom:21,
            tilt: 80,
            heading: 70,
            percentage: 0.35 //22
        },
        {
            center: new BMapGL.Point(120.1286230320907,30.26626862360339),
            zoom: 21,
            tilt: 80,
            heading: 150,
            percentage: 0.36 // 31
        },

        {
            center: new BMapGL.Point(120.12860389482856,30.265731477119328),
            zoom: 21,
            tilt: 70,
            heading: 180,
            percentage: 0.65 //32
        },
        {
            center: new BMapGL.Point(120.12867406478975,30.265346612606997),
            zoom:21,
            tilt: 80,
            heading: 250,
            percentage: 0.75 //41
        },
        {
            center: new BMapGL.Point(120.12900258778987,30.26522478467406),
            zoom:21,
            tilt: 80,
            heading: 250,
            percentage: 0.85 //42
        },
        {
            center: new BMapGL.Point(120.12948739843085,30.265064193074622),
            zoom:21,
            tilt: 80,
            heading: 260,
            percentage: 0.90
        },
        {
            center: new BMapGL.Point(120.12953843112989,30.2651638706503337),
            zoom: 90,
            tilt: 80,
            heading: 340,//11
            percentage: 1
        }
    ];


    var opts = {
        duration: 50000,
        delay: 5000,
        interation: 'INFINITE'
    };
    // 声明动画对象
    var animation = new BMapGL.ViewAnimation(keyFrames, opts);
    // 监听事件
    animation.addEventListener('animationstart', function(e){console.log('start')});
    animation.addEventListener('animationiterations', function(e){console.log('onanimationiterations')});
    animation.addEventListener('animationend', function(e){console.log('end')});
    // 开始播放动画
    setTimeout('bmap.startViewAnimation(animation)', 00);
</script>

