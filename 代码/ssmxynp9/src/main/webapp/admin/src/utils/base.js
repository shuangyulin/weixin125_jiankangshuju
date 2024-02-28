const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmxynp9/",
            name: "ssmxynp9",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmxynp9/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "个人健康数据管理系统小程序"
        } 
    }
}
export default base
