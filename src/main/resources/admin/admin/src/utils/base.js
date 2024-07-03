const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot8525u/",
            name: "springboot8525u",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot8525u/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "在线教育系统"
        } 
    }
}
export default base
