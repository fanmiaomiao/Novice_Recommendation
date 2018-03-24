$(document).ready(function() {
    App.init();
});
$(function() {
    var date = new Date();
    var year = date.getFullYear();
    var month = date.getMonth() + 1;
    var day = date.getDate();

    // 负载量前十名AP
    var data = [29900, 171500, 106400, 129332, 144320, 221760, 301356, 181485, 322164, 219431];
    var chart = Highcharts.chart('top10', {
        title: {
            text: 'AP负载量排行榜Top 10'
        },
        subtitle: {
            text: '截止日期' + year + '年' + month + '月' + day + '日'
        },
        xAxis: {
            categories: [
                '小吃1',
                '小吃2',
                '小吃3',
                '小吃4',
                '小吃5',
                '小吃6',
                '小吃7',
                '小吃8',
                '小吃9',
                '小吃10'
            ]
        },
        yAxis: {
            title: {
                text: "AP负载量"
            }
        },
        series: [{
            type: 'column',
            name: "AP负载量",
            colorByPoint: true,
            data: data,
            showInLegend: false
        }],
        credits: {
            enabled: false // 禁用版权信息
        }
    });
    $('#plain').click(function() {
        chart.update({
            chart: {
                inverted: false,
                polar: false
            },
            subtitle: {
                text: '截止日期' + year + '年' + month + '月' + day + '日'
            }
        });
    });
    $('#inverted').click(function() {
        // chart.update 支持全部属性动态更新
        chart.update({
            chart: {
                inverted: true,
                polar: false
            },
            subtitle: {
                text: '截止日期' + year + '年' + month + '月' + day + '日'
            }
        });
    });
    $('#polar').click(function() {
        chart.update({
            chart: {
                inverted: false,
                polar: true
            },
            subtitle: {
                text: '截止日期' + year + '年' + month + '月' + day + '日'
            }
        });
    });


    // 负载量后十名AP
    $('#bottom10').highcharts({
        chart: {
            type: 'column',
            margin: 75,
            options3d: {
                enabled: true,
                alpha: 10,
                beta: 25,
                depth: 70
            }
        },
        title: {
            text: 'AP负载量排行榜bottom 10'
        },
        subtitle: {
            text: '截止日期' + year + '年' + month + '月' + day + '日'
        },
        plotOptions: {
            column: {
                depth: 25
            }
        },
        xAxis: {
            categories: [
                '小吃1',
                '小吃2',
                '小吃3',
                '小吃4',
                '小吃5',
                '小吃6',
                '小吃7',
                '小吃8',
                '小吃9',
                '小吃10'
            ]
        },
        yAxis: {
            title: {
                text: null
            }
        },
        series: [{
            name: 'AP负载量',
            data: [2, 3, 0, 4, 0, 5, 1, 4, 6, 3]
        }],
        credits: {
            enabled: false // 禁用版权信息
        }
    });

    //3D饼图
    $('#pie').highcharts({
        chart: {
            type: 'pie',
            options3d: {
                enabled: true,
                alpha: 45,
                beta: 0
            }
        },
        title: {
            text: 'AP总负载占有率'
        },
        tooltip: {
            pointFormat: '{series.name}: <b>{point.percentage:.1f}%</b>'
        },
        plotOptions: {
            pie: {
                allowPointSelect: true,
                cursor: 'pointer',
                depth: 35,
                dataLabels: {
                    enabled: true,
                    format: '{point.name}'
                }
            }
        },
        series: [{
            type: 'pie',
            name: '负载量占有率',
            data: [
                ['小吃1', 45.0],
                ['小吃2', 26.8], {
                    name: '小吃3',
                    y: 12.8,
                    sliced: true,
                    selected: true
                },
                ['小吃4', 8.5],
                ['小吃5', 6.2],
                ['小吃6', 45.0],
                ['小吃7', 8.5],
                ['小吃8', 6.2],
                ['小吃9', 0.7]
            ]
        }]
    });
});