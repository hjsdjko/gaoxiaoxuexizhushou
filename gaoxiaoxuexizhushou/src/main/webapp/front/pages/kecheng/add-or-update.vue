
<template>
    <view class="content">
        <form class="app-update-pv">
            <view
                    :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}'
                    class="cu-form-group">
                <view :style='{"width":"160rpx","fontSize":"28rpx","color":"#008761","textAlign":"left"}'
                      class="title">资源标题</view>
                <input   disabled
                         :style='{"boxShadow":"0 0 16rpx #3CB371 inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#008761","borderRadius":"20rpx","color":"#008761","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
                         :disabled="ro.kechengName" type="text" v-model="ruleForm.kechengName" placeholder="资源标题"></input>
            </view>
                <view :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}'
                      class="cu-form-group">
                    <view :style='{"width":"160rpx","fontSize":"28rpx","color":"#008761","textAlign":"left"}'
                          class="title">资源类型</view>
                    <picker @change="kechengTypesChange" :value="kechengTypesIndex" :range="kechengTypesOptions" range-key="indexName">
                        <view
                                :style='{"boxShadow":"0 0 16rpx #3CB371 inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#008761","borderRadius":"20rpx","color":"#008761","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
                                class="uni-input">{{ruleForm.kechengTypes?ruleForm.kechengValue:"请选择资源类型"}}</view>
                    </picker>
                </view>
                <view
                        :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(218, 220, 219, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"108rpx"}'
                        class="cu-form-group" @tap="kechengPhotoTap">
                    <view :style='{"width":"160rpx","fontSize":"28rpx","color":"#008761","textAlign":"left"}'
                          class="title">资源图片</view>
                    <view class="right-input" style="padding:0;textAlign:left">
                        <image
                                :style='{"width":"68rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","borderRadius":"100%","textAlign":"left","height":"68rpx"}'
                                class="avator" v-if="ruleForm.kechengPhoto" :src="ruleForm.kechengPhoto" mode="aspectFill">
                        </image>
                        <image  :style='{"width":"68rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","borderRadius":"100%","textAlign":"left","height":"68rpx"}'
                                class="avator" v-else src="../../static/gen/upload.png" mode="aspectFill"></image>
                    </view>
                </view>
					                <view
                        :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(218, 220, 219, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"108rpx"}'
                        class="cu-form-group" @tap="kechengVideoTap">
                    <view :style='{"width":"160rpx","fontSize":"28rpx","color":"#008761","textAlign":"left"}'
                          class="title">资源视频</view>
                    <view class="right-input" style="padding:0;textAlign:left">
                        <image
                                :style='{"width":"68rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","borderRadius":"100%","textAlign":"left","height":"68rpx"}'
                                class="avator" v-if="ruleForm.kechengVideo" :src="ruleForm.kechengVideo" mode="aspectFill">
                        </image>
                        <image  :style='{"width":"68rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","borderRadius":"100%","textAlign":"left","height":"68rpx"}'
                                class="avator" v-else src="../../static/gen/upload.png" mode="aspectFill"></image>
                    </view>
                </view>
					                <view
                        :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(218, 220, 219, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"108rpx"}'
                        class="cu-form-group" @tap="kechengFileTap">
                    <view :style='{"width":"160rpx","fontSize":"28rpx","color":"#008761","textAlign":"left"}'
                          class="title">课件下载</view>
                    <view class="right-input" style="padding:0;textAlign:left">
                        <image
                                :style='{"width":"68rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","borderRadius":"100%","textAlign":"left","height":"68rpx"}'
                                class="avator" v-if="ruleForm.kechengFile" :src="ruleForm.kechengFile" mode="aspectFill">
                        </image>
                        <image  :style='{"width":"68rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","borderRadius":"100%","textAlign":"left","height":"68rpx"}'
                                class="avator" v-else src="../../static/gen/upload.png" mode="aspectFill"></image>
                    </view>
                </view>
					                <view :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}'
                      class="cu-form-group">
                    <view :style='{"width":"160rpx","fontSize":"28rpx","color":"#008761","textAlign":"left"}'
                          class="title">班级</view>
                    <picker @change="banjiTypesChange" :value="banjiTypesIndex" :range="banjiTypesOptions" range-key="indexName">
                        <view
                                :style='{"boxShadow":"0 0 16rpx #3CB371 inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#008761","borderRadius":"20rpx","color":"#008761","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
                                class="uni-input">{{ruleForm.banjiTypes?ruleForm.banjiValue:"请选择班级"}}</view>
                    </picker>
                </view>
<!-- text后缀 -->
            <view
                    :style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"210rpx"}'
                    class="cu-form-group">
                <view :style='{"width":"160rpx","fontSize":"28rpx","color":"#008761","textAlign":"left"}'
                      class="title">资源详情</view>
                <textarea :style='{"boxShadow":"0 0 16rpx #3CB371 inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#008761","borderRadius":"20rpx","color":"#008761","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx","height":"200rpx"}'
                          :disabled="ro.kechengContent" v-model="ruleForm.kechengContent" placeholder="资源详情"/>
            </view>

            <view class="btn">
                <button
                        :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,0) inset","backgroundColor":"#008761","borderColor":"#409EFF","borderRadius":"8rpx","color":"rgba(255, 255, 255, 1)","borderWidth":"0","width":"70%","fontSize":"32rpx","borderStyle":"solid","height":"80rpx"}'
                        @tap="onSubmitTap" class="bg-red">提交</button>
            </view>
        </form>

					<w-picker mode="dateTime" step="1" :current="false" :hasSecond="false" @confirm="insertTimeConfirm"
                              ref="insertTime" themeColor="#333333"></w-picker>
					<w-picker mode="dateTime" step="1" :current="false" :hasSecond="false" @confirm="createTimeConfirm"
                              ref="createTime" themeColor="#333333"></w-picker>


    </view>
</template>

<script>
    import wPicker from "@/components/w-picker/w-picker.vue";

    export default {
        data() {
            return {
                cross: '',
                ro:{
					kechengName: false,
					kechengTypes: false,
					kechengPhoto: false,
					kechengVideo: false,
					kechengFile: false,
					banjiTypes: false,
					jiaoshiId: false,
					kechengContent: false,
					insertTime: false,
					createTime: false,
        },
            ruleForm: {
					kechengName: '',
					kechengTypes: '',//数字
					kechengValue: '',//数字对应的值
					kechengPhoto: '',
					kechengVideo: '',
					kechengFile: '',
					banjiTypes: '',//数字
					banjiValue: '',//数字对应的值
					jiaoshiId: '',
					kechengContent: '',
					insertTime: '',
					createTime: '',
            },
            // 登陆用户信息
            user: {},
				kechengTypesOptions: [],
							kechengTypesIndex : 0,
				banjiTypesOptions: [],
							banjiTypesIndex : 0,

        }
        },
        components: {
            wPicker
        },
        computed: {
            baseUrl() {
                return this.$base.url;
            },
        },
        async onLoad(options) {

		/*下拉框*/
			let kechengTypesParams = {
                page: 1,
                limit: 100,
                dicCode: 'kecheng_types',
            }
			let kechengTypes = await this.$api.page(`dictionary`, kechengTypesParams);
			this.kechengTypesOptions = kechengTypes.data.list
		/*下拉框*/
			let banjiTypesParams = {
                page: 1,
                limit: 100,
                dicCode: 'banji_types',
            }
			let banjiTypes = await this.$api.page(`dictionary`, banjiTypesParams);
			this.banjiTypesOptions = banjiTypes.data.list


            // 如果是更新操作
            if (options.id) {
                this.ruleForm.id = options.id;
                // 获取信息
                let res = await this.$api.info(`kecheng`, this.ruleForm.id);
                this.ruleForm = res.data;
            }
            if(options.kechengId){
                this.ruleForm.kechengId = options.kechengId;
            }
            // 跨表
            // this.styleChange()
        },
        methods: {
            // 下拉变化
            kechengTypesChange(e) {
                this.kechengTypesIndex = e.target.value
                this.ruleForm.kechengValue = this.kechengTypesOptions[this.kechengTypesIndex].indexName
                this.ruleForm.kechengTypes = this.kechengTypesOptions[this.kechengTypesIndex].codeIndex
            },
            banjiTypesChange(e) {
                this.banjiTypesIndex = e.target.value
                this.ruleForm.banjiValue = this.banjiTypesOptions[this.banjiTypesIndex].indexName
                this.ruleForm.banjiTypes = this.banjiTypesOptions[this.banjiTypesIndex].codeIndex
            },


            // styleChange() {
            // 	this.$nextTick(() => {
            // 		// document.querySelectorAll('.app-update-pv .cu-form-group .uni-yaoxianStyle-yaoxianStyle').forEach(el=>{
            // 		//   el.style.backgroundColor = this.addUpdateForm.yaoxianStyle.content.backgroundColor
            // 		// })
            // 	})
            // },


			kechengPhotoTap() {
                let _this = this;
                this.$api.upload(function(res) {
                    _this.ruleForm.kechengPhoto = _this.$base.url + 'upload/' + res.file;
                    _this.$forceUpdate();
                    _this.$nextTick(() => {
                        // _this.styleChange()
                    })
                });
            },
			kechengVideoTap() {
                let _this = this;
                this.$api.upload(function(res) {
                    _this.ruleForm.kechengVideo = _this.$base.url + 'upload/' + res.file;
                    _this.$forceUpdate();
                    _this.$nextTick(() => {
                        // _this.styleChange()
                    })
                });
            },
			kechengFileTap() {
                let _this = this;
                this.$api.upload(function(res) {
                    _this.ruleForm.kechengFile = _this.$base.url + 'upload/' + res.file;
                    _this.$forceUpdate();
                    _this.$nextTick(() => {
                        // _this.styleChange()
                    })
                });
            },
			// 日期控件
			insertTimeConfirm(val) {
                console.log(val)
                this.ruleForm.insertTime = val.result;
                this.$forceUpdate();
            },
			// 日期控件
			createTimeConfirm(val) {
                console.log(val)
                this.ruleForm.createTime = val.result;
                this.$forceUpdate();
            },




            getUUID() {
                return new Date().getTime();
            },
            async onSubmitTap() {
				if ((!this.ruleForm.kechengName)) {
                    this.$utils.msg(`资源标题不能为空`);
                    return
                }
				if ((!this.ruleForm.kechengPhoto)) {
                    this.$utils.msg(`资源图片不能为空`);
                    return
                }
				if ((!this.ruleForm.banjiTypes)) {
                    this.$utils.msg(`班级不能为空`);
                    return
                }
                if (this.ruleForm.id) {
                    await this.$api.update(`kecheng`, this.ruleForm);
                } else {
                    await this.$api.save(`kecheng`, this.ruleForm);
                }
                uni.setStorageSync('pingluenStateState', true);
                this.$utils.msgBack('提交成功');
            },
            getDate(type) {
                const date = new Date();
                let year = date.getFullYear();
                let month = date.getMonth() + 1;
                let day = date.getDate();
                if (type === 'start') {
                    year = year - 60;
                } else if (type === 'end') {
                    year = year + 2;
                }
                month = month > 9 ? month : '0' + month;;
                day = day > 9 ? day : '0' + day;
                return `${year}-${month}-${day}`;
            },
            toggleTab(str) {
                this.$refs[str].show();
            }
        }
    }
</script>

<style lang="scss" scoped>
    .container {
        padding: 20upx;
    }

    .content:after {
        position: fixed;
        top: 0;
        right: 0;
        left: 0;
        bottom: 0;
        content: '';
        background-attachment: fixed;
        background-size: cover;
        background-position: center;
    }

    textarea {
        border: 1upx solid #EEEEEE;
        border-radius: 20upx;
        padding: 20upx;
    }

    .title {
        width: 180upx;
    }

    .avator {
        width: 150upx;
        height: 60upx;
    }

    .right-input {
        flex: 1;
        text-align: left;
        padding: 0 24upx;
    }

    .cu-form-group.active {
        justify-content: space-between;
    }

    .btn {
        display: flex;
        align-items: center;
        justify-content: center;
        flex-wrap: wrap;
        padding: 20upx 0;
    }

    .cu-form-group {
        padding: 0 24upx;
        background-color: transparent;
        min-height: inherit;
    }

    .cu-form-group+.cu-form-group {
        border: 0;
    }

    .cu-form-group uni-input {
        padding: 0 30upx;
    }

    .uni-input {
        padding: 0 30upx;
    }

    .cu-form-group uni-textarea {
        padding: 30upx;
        margin: 0;
    }

    .cu-form-group uni-picker::after {
        line-height: 68rpx;
    }

    .select .uni-input {
        line-height: 68rpx;
    }

    .input .right-input {
        line-height: 68rpx;
    }
</style>