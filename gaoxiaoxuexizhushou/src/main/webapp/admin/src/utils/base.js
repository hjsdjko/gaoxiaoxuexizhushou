const base = {
    get() {
        return {
            url : "http://localhost:8080/gaoxiaoxuexizhushou/",
            name: "gaoxiaoxuexizhushou",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/gaoxiaoxuexizhushou/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "高校学习助手小程序"
        } 
    }
}
export default base
