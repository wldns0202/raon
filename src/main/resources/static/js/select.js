const main = {
    init: function () {
        const _this = this;
        $('#btn-check').on('click', function () {
            _this.check()
        })
    },
    check: function () {
        const radioList = document.getElementsByName('product')
        radioList.forEach((node) => {
            if(node.checked)
                opener.document.getElementById('product').innerText = node.value
        })
        const checkList = document.getElementsByName('check')
        let checkResult = ''
        checkList.forEach((node) => {
            if(node.checked)
                checkResult += node.value + ' '
        })
        opener.document.getElementById('check').innerText = checkResult
        window.close()
    }
};
main.init()