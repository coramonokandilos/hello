# Xtext�ɂ���

Xtext��Java�ɂ��DSL�̊J����e�Ղɂ���悤�ɂ���Eclipse�x�[�X�̃t���[�����[�N

## ���j
* 2006�NopenArchitectureWare(oAW) project�ɂ���ĊJ��
* 2008�N��eclipse Modeling Project�P��
* itemis�ɂ���ĊJ������Ă���B

## �@�\

* DSL�����ۂɁAXtext������g���ĕ��@���L�ڂ���B
* �e�L�X�g�`���̒�`����Ecore���f�����h�������B
* ��L��`����R�[�h�W�F�l���[�^��ANTLR parser�A�I�u�W�F�N�g���f�����쐬

IDE�Ƃ��Ĉȉ��̂悤�ȋ@�\���쐬�����B

* �G�f�B�^�̃V���^�b�N�X�n�C���C�g
* �R�[�h�⊮
* �R�[�h�q���g
* �A�E�g���C���r���[
* �\�[�X�R�[�h�i�r�Q�[�V����
* ��r�r���[
* �z�o�[
* �R�[�h�̐܂肽���݂⃊�t�@�N�^�����O




## �쐬���@
* xtext�v���W�F�N�g�̍쐬

![Alt text](img/project_wizard1.png)

* �g���q��qdsl�ɐݒ�

![Alt text](img/project_wizard2.png)

* xtext���C������B

![QDsl.xtext](src/org/xtext/example/qdsl/QDsl.text)

* GenerateQDsl.mwe2���E�N���b�N��MWE2 Workflow�����s����B

### validation��ǉ�

* QDslJavaValidation.java��@Check��annotation�̂������\�b�h���쐬�����validation�ɂȂ�B

        @Check
        public void checkAnswerTypeCorrespondence(Question question) {
            if ( XXXX ) {
                error("",XXXX);//����ŃG���[�ƂȂ�B
            }
        }


### �\�[�X�R�[�h�����pJava�܂���Workflow���쐬����悤�ɐݒ�

* GenerateQDsl.mwe2

                fragment = generator.GeneratorFragment {
                    generateMwe = true //�\�[�X�R�[�h����MWE�쐬
                    generateJavaMain = true //�\�[�X�R�[�h�����p
                }
