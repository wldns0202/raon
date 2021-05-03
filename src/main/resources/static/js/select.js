const main = {
    init: function () {
        // 이벤트 등록
        const _this = this;
        $('#btn-check').on('click', function () {
            _this.check()
        })
        $("input:radio[name=product]").on('click', function () {
            _this.radioClick()
        })
        // document.addEventListener("DOMContentLoaded", function(){
        //     _this.
        // });
    },
    check: function () {
        // 클릭된 라디오 버튼 [제품]
        const radioList = document.getElementsByName('product')
        radioList.forEach((node) => {
            if(node.checked)
                opener.document.getElementById('product').innerText = node.value
        })

        // 클릭된 체크박스 버튼 [고객사]
        const checkList = document.getElementsByName('check')
        let checkResult = ''
        checkList.forEach((node) => {
            if(node.checked)
                checkResult += node.value + ' '
        })
        opener.document.getElementById('check').innerText = checkResult
        window.close()
    },
    radioClick: function () {
        // 클릭된 라디오 버튼 [제품]
        const radioList = document.getElementsByName('product')
        let productName = null
        radioList.forEach((node) => {
            if(node.checked)
                productName = node.value
        })

        // DB에서 제품명에 대한 고객사 가져오는 부분
        const recvData = this.getData(productName)
        const nameArr = recvData.split(',')

        // 고객사 리스트 초기화
        $('#checkList').empty()
        // 고객사 DOM 추가
        let checkBox = null
        let name = null
        for(let i=0; i<nameArr.length; i++){
            name = nameArr[i]
            checkBox = '<input type="checkbox" name="check" value="'+name+'">'
            $('#checkList').append(checkBox)
            $('#checkList').append(name)
            $('#checkList').append('<br/>')
        }
    },
    getData: function (productName) {
        let data = null
        // DB에서 데이터 받아와야함
        if(productName === 'Key# Biz'){
            data = '비즈1,비즈2,비즈3'
        }
        else if(productName === 'Key# nxCR'){
            data = 'nxCR1,nxCR2'
        }
        else if(productName === 'Key# Wireless'){
            data = 'Wireless1,Wireless2,Wireless3,Wireless4,Wireless5,Wireless6,Wireless7,Wireless8,Wireless9,Wireless10,Wireless11,Wireless12,Wireless1,Wireless2,Wireless3,Wireless4,Wireless5,Wireless6,Wireless7,Wireless8,Wireless9,Wireless10,Wireless11,Wireless12'
        }
        else if(productName === 'TouchEn TransKey'){
            data = 'TK1,Tk2,Tk3'
        }
        else if(productName === 'TouchEn mTransKey Web'){
            data = 'mtweb1,mtweb2,mtweb3,mtweb4'
        }
        else if(productName === 'TouchEn mTransKey CS'){
            data = 'mtcs1,mtcs2'
        }
        else if(productName === 'TouchEn mVaccine Web'){
            data = 'mvweb1,mvweb2,mvweb3,mvweb4,mvweb5,mvweb6'
        }
        else if(productName === 'TouchEn mVaccine CS'){
            data = 'mvcs1,mvcs2,mvcs3'
        }
        return data
    }
};
main.init()

